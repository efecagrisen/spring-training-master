package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Honda","Civic");
        Car c3 = new Car("Toyota","Corolla");



    }
}
