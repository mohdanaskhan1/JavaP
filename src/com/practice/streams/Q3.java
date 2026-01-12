package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "", "This", "", "Is", "Mohd", "Anas");
        long count = list.stream().filter(x -> x.isEmpty()).count();
        System.out.println(count);
    }
}
