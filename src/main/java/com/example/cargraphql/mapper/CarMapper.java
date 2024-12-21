package com.example.cargraphql.mapper;

import com.example.cargraphql.dao.entities.Car;
import com.example.cargraphql.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public CarDTO CarToCarDTO(Car car){
        return modelMapper.map(car,CarDTO.class);
    }
    public Car CarDTOTOCar(CarDTO carDTO){
        return modelMapper.map(carDTO,Car.class);
    }
}
