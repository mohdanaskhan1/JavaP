package com.java8.FunctionalInterface;

@FunctionalInterface
public interface FunctionalInt {
    public void abc();

    //Object
    public String toString();

    public default void m1(){
        System.out.println("Default Method");
    }

    public static void m2(){
        System.out.println("Static Method");
    }
}
