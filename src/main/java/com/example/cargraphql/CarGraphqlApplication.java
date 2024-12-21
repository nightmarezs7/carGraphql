package com.example.cargraphql;

import com.example.cargraphql.dto.CarDTO;
import com.example.cargraphql.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarGraphqlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CarService carService){
        return args -> {
            carService.saveCar(
                    CarDTO.builder().model("Ferari").color("green").matricul("2526262").price(30).build()
            );
        };
    }
}
