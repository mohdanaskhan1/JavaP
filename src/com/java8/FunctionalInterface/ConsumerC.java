package com.java8.FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerC {
    public static void main(String[] args) {
        String[] str = {"abcx","bcdy","defaa"};
        Consumer<String> stringConsumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        };
        Consumer<String> stringConsumer1 = s-> System.out.println(s.length());

        for (String word : str){
            System.out.print(word +": " );
            stringConsumer1.accept(word);
        }



    }
}
