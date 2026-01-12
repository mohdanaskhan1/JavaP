package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Q14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-1,2,-5,3,2);
        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//        List<Integer> list2 = list.stream().sorted((a,b)->b-a).limit(3).toList();

        System.out.println(list1);
    }
}
