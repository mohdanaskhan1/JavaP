package com.Polymorphism;

public class Audi extends Car {
    public Audi() {
        System.out.println("Audi");
    }

    @Override
    public void Engine() {
        System.out.println("Audi Engine");
    }

    @Override
    public void Drive() {
        System.out.println("Audi Drive");
    }

    @Override
    public void Tire() {
        System.out.println("Audi Tire");
    }
}
