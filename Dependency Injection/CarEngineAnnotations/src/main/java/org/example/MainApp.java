package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext c=new AnnotationConfigApplicationContext("org.example");
        Car car=c.getBean(Car.class);
        car.drive();
    }
}
