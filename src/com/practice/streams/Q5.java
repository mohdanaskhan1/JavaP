package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(90, 30, 40, 60, 20, 90);
        list.stream().filter(x -> x > 50).sorted().findFirst().ifPresent(System.out::println);
        Integer i = list.stream().filter(x -> x > 50).sorted().findFirst().orElse(-1);
        System.out.println(i);
    }
}
