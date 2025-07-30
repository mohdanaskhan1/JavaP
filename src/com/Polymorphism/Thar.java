package com.Polymorphism;

public class Thar extends Car {
    public Thar() {
        System.out.println("Thar");
    }

    @Override
    public void Engine() {
        System.out.println("Thar Engine");
    }

    @Override
    public void Drive() {
        System.out.println("Thar Drive");
    }

    @Override
    public void Tire() {
        System.out.println("Thar Tire");
    }
}
