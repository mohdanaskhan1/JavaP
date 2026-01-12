package com.java8.StramAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prac1 {
    public static void main(String[] args) {

        String word  = "Hello this is Java";
        //olleH siht si avaJ
//        String list = Arrays.asList(word.split(" ")).stream()
//                .map(x -> new StringBuilder(x).reverse().toString())
//                .toList()
//                .stream()
//                .reduce((a,b)-> (a + " " + b))
//                .get();
//        System.out.println(list);


        String collect = Arrays.stream(word.split(" "))
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(collect);


    }
}
