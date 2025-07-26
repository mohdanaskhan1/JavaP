package com.Deadlock;

public class Launch {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

//Daemon Thread :  Supportive task or background task done by daemon thread for user thread

        Resource resource3 = new Resource();
        resource3 = new Resource();

        resource1.setName("Raju");
        resource2.setName("Kaju");

        resource1.start();
        resource2.start();


    }
}