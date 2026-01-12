package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -6);
        Set<Integer> set = list.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(set);

    }
}
