package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class S1 {
    public static void main(String[] args) {
        String s = "amsterdma";
        HashSet<String> seen = new LinkedHashSet<>();

        String first = Arrays.stream(s.split(""))
                .filter(x -> !seen.add(x))
                .toList()
                .stream()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(seen);
        System.out.println(first);

//        String s1 = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        System.out.println(s1);


    }
}
