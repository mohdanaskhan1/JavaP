package com.java8.DefautStaticMethod;

public interface Car {
    void speed();
    void miledge();
    void safetyCheck();

    public default void carAI() {
        System.out.println("CAR AI");
    }

    static void policy(){
        System.out.println("POLICY");
    }


}
