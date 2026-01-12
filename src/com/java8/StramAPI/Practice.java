package com.java8.StramAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 8, 8, 3, 4, 1, 5, 6, 7, 8, 9, 10);
//        Double collect1 = list.stream().distinct().map(x -> x * x).collect(Collectors.averagingDouble(x -> x));
//        System.out.println(collect1);

//        List<String> list = Arrays.asList("apple", "banab", "dad", "star");
//        Map<Boolean, List<String>> collect = list.stream().collect(Collectors.partitioningBy(x -> x.equalsIgnoreCase(new StringBuilder(x).reverse().toString())));
//        System.out.println(collect);


//        List<List<String>> list = Arrays.asList(Arrays.asList("apple","hei" ,"banaba", "yellow"), Arrays.asList("dad", "this", "star"));
//        String list1 = list.stream().flatMap(x -> x.stream()).collect(Collectors.joining(" "));
//        Map<Integer, List<List<String>>> string = list.stream().
//                collect(Collectors.groupingBy(x -> x.toArray().length));

        List<String> list = Arrays.asList("apple", "banab", "dad", "star");
        String s = "Hello This Is ";
        List<String> list1 = Arrays.stream(s.toLowerCase().split(""))
                .filter(x -> !x.trim().equals(""))
                .toList();
        System.out.println(list1);
//        Map<String, Long> collect = Arrays.stream(s.toLowerCase().split(""))
//                .filter(x->!x.i())
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(collect);

//
//        System.out.println(string);
//        System.out.println(list1);


    }
}
