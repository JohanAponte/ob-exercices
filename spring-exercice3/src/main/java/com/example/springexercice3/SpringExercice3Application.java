package com.example.springexercice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExercice3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringExercice3Application.class, args);

        CarRepository carRepository = context.getBean(CarRepository.class);

        Car.builder()
                .manufacturer("Toyota")
                .model("Prius")
                .yearCreation(2022)
                .build();

        carRepository.save(
                Car.builder()
                        .manufacturer("Toyota")
                        .model("Prius")
                        .yearCreation(2022)
                        .build()
        );
        carRepository.save(
                Car.builder()
                        .manufacturer("Toyota1")
                        .model("Prius")
                        .yearCreation(2022)
                        .build()
        );
        carRepository.save(
                Car.builder()
                        .manufacturer("Toyota2")
                        .model("Prius")
                        .yearCreation(2022)
                        .build()
        );

        System.out.println(carRepository.findAll());
    }

}
