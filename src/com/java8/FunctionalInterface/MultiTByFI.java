package com.java8.FunctionalInterface;

public class MultiTByFI {
    public static void main(String[] args) throws InterruptedException {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=1 ; i<11;i++){
//                    System.out.println(7*i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//
//            }
//        };
//
//        Runnable r2 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=1 ; i<11;i++){
//                    System.out.println(5*i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//
//            }
//        };
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//
//        t1.start();
//        t2.start();



        new Thread(() -> {
            for (int i=1 ; i<11;i++){
                System.out.println(5*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->  {
            for (int i=1 ; i<11;i++){
                System.out.println(7*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();








    }
}
