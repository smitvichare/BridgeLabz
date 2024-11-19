package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;

    }

    public Car() {
        System.out.println("Car : Default");
    }

    public void drive() {
        boolean start = engine.start();


        if (start) {
            System.out.println("Car : successfully");
        } else {
            System.out.println("Engine10 not start");
        }

    }
}