package com.example.cargraphql.service;

import com.example.cargraphql.dto.CarDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDTO );

    public List<CarDTO> getCarByModel(String model);
}
