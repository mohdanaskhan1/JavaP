package com.practice.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Q26 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ramar","this","mym");
        List<String> list1 = list.stream().filter(x->x.equalsIgnoreCase(new StringBuilder(x).reverse().toString())).toList();
        System.out.println(list1);
    }
}