package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -6);
        Optional<Integer> i = list.stream().max((a, b) -> (a - b));
        System.out.println(i.get());
    }
}
