package com.java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionC {
    public static void main(String[] args) {
        String[] words = {"raju","kaju","maju"};

//        Function<String, String> stringStringFunction = new Function<>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        };

        Function<String,String> stringStringFunction1 = s -> s.toUpperCase();

        for (String word : words){
            System.out.println(stringStringFunction1.apply(word));
        }
    }
}
