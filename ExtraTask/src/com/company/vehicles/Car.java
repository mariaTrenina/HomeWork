package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    String carModel;
    String carClass;
    double wight;
    Driver driver;
    Engine engine;

    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnRight() {
        System.out.println("Right turn");
    }
    public void turnLeft() {
        System.out.println("Left turn");
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "car model:" + carModel +
                ", car class:" + carClass +
                ", wight of the car=" + wight +
                ", information about the driver=" + driver +
                ", information about the engine=" + engine;
    }
}
