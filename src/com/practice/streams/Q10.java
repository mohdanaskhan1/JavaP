package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-1,2,-5,3);
        boolean b = list.stream().mapToInt(Integer::intValue).anyMatch(x->x<0);
        boolean b1 = list.stream().anyMatch(x->x<0);
        System.out.println(b);
        System.out.println(b1);
    }
}
