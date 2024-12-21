package com.example.cargraphql.web;

import com.example.cargraphql.dto.CarDTO;
import com.example.cargraphql.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {
    @Autowired
    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(CarDTO carDTO){
        return carService.saveCar(carDTO);
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(String model){
        return carService.getCarByModel(model);
    }
}
