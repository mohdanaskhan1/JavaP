package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q18 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas");
        List<Integer> list1 = list.stream().map(String::length).toList();
        System.out.println(list1);
        Double collect = list.stream().map(String::length).collect(Collectors.averagingInt(x->x));
        System.out.println(collect);
    }
}
