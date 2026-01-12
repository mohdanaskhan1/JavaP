package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
