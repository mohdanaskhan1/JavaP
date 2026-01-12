package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class S2 {
    public static void main(String[] args) {
        int i = 1234;
        int j = 0;

        String s = Arrays.stream(String.valueOf(i).split("")).reduce((a, b) -> b + a).get();

        String collect = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.collectingAndThen(
                Collectors.joining(),
                x -> {
                    return new StringBuilder(x).reverse().toString();
                }
        ));

        String collect1 = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.collectingAndThen(
                Collectors.toList(),
                x -> {
                    Collections.reverse(x);
                    return String.join("", x);
                }
        ));
        System.out.println(collect);
        System.out.println(collect1);

        System.out.println(s);


        while (i > 0) {
            j = (j * 10) + (i % 10);
            i = i / 10;
        }
        System.out.println(j);


    }
}
