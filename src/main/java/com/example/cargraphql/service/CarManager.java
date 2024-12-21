package com.example.cargraphql.service;

import com.example.cargraphql.dao.entities.Car;
import com.example.cargraphql.dao.repositories.CarRepository;
import com.example.cargraphql.dto.CarDTO;
import com.example.cargraphql.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService {
    private CarRepository carRepository;
    private CarMapper carMapper;
    @Override
    public CarDTO saveCar(CarDTO carDTO ) {
        Car car = carMapper.CarDTOTOCar(carDTO);
        car = carRepository.save(car);
        return carMapper.CarToCarDTO(car);
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findCarByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for(Car car : cars){
            carDTOS.add(carMapper.CarToCarDTO(car));
        }
        return carDTOS;
    }
}
