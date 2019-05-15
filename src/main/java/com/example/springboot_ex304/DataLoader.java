package com.example.springboot_ex304;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String[] strings) throws Exception {
        Car car = new Car("2002", "Lexus", "SUV");
        carRepository.save(car);

        car = new Car("2012", "Tesla", "Model 3");
        carRepository.save(car);

        car = new Car("2019", "Tesla", "Model S");

        carRepository.save(car);

    }
}
