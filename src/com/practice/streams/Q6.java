package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(90, 30, 40, 60, 20, 90);
        int sum = list.stream().mapToInt(i->i).sum();
        System.out.println(sum);
    }
}
