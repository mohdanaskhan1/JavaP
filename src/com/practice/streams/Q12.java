package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Q12 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas","Hi","Is","Is");
        LinkedHashMap<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }
}
