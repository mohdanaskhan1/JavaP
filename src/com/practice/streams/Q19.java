package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q19 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas");
        Set<String> collect = Arrays.stream(list.stream().collect(Collectors.joining()).split("")).collect(Collectors.toSet());
        System.out.println(collect);


        Set<Object> collect1 = list.stream().flatMap(x -> x.chars().mapToObj(y->(char)y)).collect(Collectors.toSet());
        System.out.println(collect1);
    }
}
