package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.example");
        Car car=context.getBean(Car.class);
        car.drive();
    }

}
