package com.practice.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q17 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7), Arrays.asList(8, 9, 0));
        List<Integer> list1 = list.stream().flatMap(Collection::stream).toList();
        System.out.println(list1);
    }

}
