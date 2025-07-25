package com.Deadlock;

public class Resource extends Thread {

    private final String res1 = "RES1";
    private final String res2 = "RES2";
    private final String res3 = "RES3";

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equalsIgnoreCase("Raju")){
            rajuAccess(name);
        }
        else {
            kajuAccess(name);
        }
    }

    public void rajuAccess(String name){
        synchronized (res1){
            System.out.println(name +" using "+res1);
            timeWait();

            synchronized (res2){
                System.out.println(name +" using "+res2);
                timeWait();

                synchronized (res3){
                    System.out.println(name +" using "+res3);
                    timeWait();
                }
            }
        }

    }
    public void kajuAccess(String name){
        synchronized (res3){
            System.out.println(name +" using "+res3);
            timeWait();

            synchronized (res2){
                System.out.println(name +" using "+res2);
                timeWait();

                synchronized (res1){
                    System.out.println(name +" using "+res1);
                    timeWait();
                }
            }
        }

    }

    public void timeWait()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
