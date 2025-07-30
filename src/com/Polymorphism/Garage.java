package com.Polymorphism;

public class Garage extends Launch{
    public Garage() {
        System.out.println("Garage");
    }

    public void permit(Car car) {
        car.Engine();
        car.Drive();
        car.Tire();
    }
}
