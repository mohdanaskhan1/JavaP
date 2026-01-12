package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-1,2,-5,3,2);
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
