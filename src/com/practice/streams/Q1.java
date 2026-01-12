package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integerStream = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(integerStream);
    }
}
