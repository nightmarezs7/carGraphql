package com.example.cargraphql.dao.repositories;

import com.example.cargraphql.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
    public List<Car> findCarByModel(String model);
}
