package com.java8.DefautStaticMethod;

public class Tesla implements Car{
    @Override
    public void speed() {
        System.out.println("Tesla speed");
    }

    @Override
    public void miledge() {
        System.out.println("Tesla Miledge");
    }

    @Override
    public void safetyCheck() {
        System.out.println("Tesla SafetyCheck");
    }

    @Override
    public void carAI() {
        System.out.println("Tesla AI");
    }
}
