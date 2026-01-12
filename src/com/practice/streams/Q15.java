package com.practice.streams;

import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-1,2,-5);
        int[] list1 = {1,2,3,-1,2,-5};
        Optional<Integer> i = Arrays.stream(list1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(i.get());
        Integer first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(first);

    }
}
