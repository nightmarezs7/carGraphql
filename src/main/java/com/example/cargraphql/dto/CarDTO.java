package com.example.cargraphql.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private double price;
}
