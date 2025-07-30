package com.Polymorphism;

public class Alto extends Car{
    public Alto() {
        System.out.println("Alto");
    }

    @Override
    public void Engine() {
        System.out.println("Alto Engine");
    }

    @Override
    public void Drive() {
        System.out.println("Alto Drive");
    }

    @Override
    public void Tire() {
        System.out.println("Alto Tire");
    }
}
