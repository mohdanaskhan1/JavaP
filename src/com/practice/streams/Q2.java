package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas");
        List<String> list1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(list1);
    }
}
