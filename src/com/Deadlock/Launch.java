package com.Deadlock;

public class Launch {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        resource1.setName("Raju");
        resource2.setName("Kaju");

        resource1.start();
        resource2.start();

    }
}
