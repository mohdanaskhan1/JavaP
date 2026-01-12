package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas");
        Map<Integer, List<String>> collect = list.stream().
                collect(Collectors.groupingBy(x->x.length()));
        System.out.println(collect);
    }
}
