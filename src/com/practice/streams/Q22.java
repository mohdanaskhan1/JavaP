package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q22 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hi", "This", "Is", "Mohd", "Anas","Rahul","Rames");
        Double collect = list.stream().collect(Collectors.averagingInt(String::length));
        System.out.println(collect);
        Optional<Double> reduce = list.stream().map(s -> (double) s.length() / list.size()).reduce(Double::sum);
        System.out.println(reduce.get());

        int p = 0;
        for(int i=0 ; i<list.size() ; i++){
            if(list.get(i).length()>list.get(p).length()) {
                p = i;
            }
        }

        System.out.println(list.get(p));

        List<String> first = list.stream().collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream().sorted((a, b) -> (b.getKey() - a.getKey()))
                .map(x -> x.getValue())
                .findFirst().orElseThrow();
        first.forEach(System.out::println);

        String list1 = list.stream().sorted((a, b)->(b.length()-a.length())).findFirst().orElseThrow();
        System.out.println(list1);

        String s = list.stream().min((a, b) -> (b.length() - a.length())).orElseThrow();
        System.out.println(s);
    }
}
