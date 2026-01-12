package com.practice.ytstream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
//        int[] arr = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
//        Stream<Integer> list1 = Arrays.stream(arr).boxed();
//        System.out.println(list1.collect(Collectors.toCollection(()->new LinkedHashSet<>())));
//
//
//        int[] arr1 = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
//        Double collect = Arrays.stream(arr1).boxed().collect(Collectors.averagingInt(x -> x));
//        System.out.println(collect);
//        Optional<Double> reduce = Arrays.stream(arr1).boxed().map(x -> (double) x / arr1.length).reduce((x,y)->(x+y));
//        System.out.println(reduce.get());
//
//
//        int[] arr2 = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
//        List<Integer> boxed = Arrays.stream(arr2).boxed().sorted((x,y)->x-y).toList();
//        System.out.println(boxed);
//
//        List<String> list = Arrays.asList("hello", "this", "is", "mohd", "anas", "khan","aman");
//        long count = list.stream().filter(x -> x.startsWith("a")).count();
//        System.out.println(count);
//
//        List<String> list2 = Arrays.asList("hello", "this", "is", "mohd", "anas", "khan","aman");
//        String collect1 = list2.stream().collect(Collectors.joining(","));
//        System.out.println(collect1);
//
//        int[] arrr = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
//        boolean b = Arrays.stream(arrr).boxed().allMatch(x -> x % 2 == 0);
//        System.out.println(b);
//
//        List<String> lis = Arrays.asList("hello", "this", "is", "mohd", "anas", "khan","aman");
//        String first = lis.stream().filter(x -> !x.isEmpty()).findFirst().orElseThrow();
//        System.out.println(first);
//
//        int[] ar = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
//        Optional<Integer> limit = Arrays.stream(ar).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).
//                findFirst();
//        System.out.println(limit.get());
//
//
////        int[] ard = {7, 9, 1, 2, 3, 2, 3, 5, 7, 1, 2, 3, 9};
////        Map<Integer, Long> collect2 = Arrays.stream(ard).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
////        System.out.println(collect2);
////

        /// STREM
        //INTERMEDIATE
        //TERMINAL
//
//
//        String s = "mississsippid";
//        Map.Entry<String, Long> stringLongEntry = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                        .stream()
//                                .reduce((x,y)->x.getValue() >= y.getValue() ? x : y)
//                                        .orElseThrow();
////                .stream().max(Map.Entry.comparingByValue()).orElseThrow();
//        System.out.println(stringLongEntry);
//
//        Map<Object, Long> string = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
//        System.out.println(string);
//
//        Optional<Map.Entry<String, Long>> first = Arrays.stream(s.split(""))
//                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1)
//                .skip(1)
//                .findFirst();
//        System.out.println(first.get());


//        String word = "missimi";
//        Stream<StringBuilder> stringBuilderStream = Arrays.stream(word.split("")).map(x -> new StringBuilder(x).reverse());
//
//        boolean b = Arrays.stream(word.split("")).allMatch(x -> new StringBuilder(x).reverse());
//        System.out.println(b);

//        boolean b1 = Stream.of(word).allMatch(x -> x.equalsIgnoreCase(new StringBuilder(x).reverse().toString()));
//
//        Boolean collect = Arrays.stream(word.split("")).collect(Collectors.collectingAndThen(
//                Collectors.joining(""),
//                x -> {
//                    String string = new StringBuilder(x).reverse().toString();
//                    return word.equalsIgnoreCase(string);
//                }
//        ));
//        System.out.println(collect);
//
//
//        Stream<Character> chars = word.chars()
//                .mapToObj(x->(char)x);
//        System.out.println(chars.toList());
//
//
//        System.out.println(b1);

//        String word = "abbasg";
//        String entries = Arrays.stream(word.split(""))
//                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x->x.getValue()==1)
//                .skip(1)
//                .map(x->x.getKey())
//                .findFirst()
//                .orElseThrow();
//        System.out.println(entries);

//        String sentence = "my name is anas.";
////       anas is name my.
//        String collect = Arrays.stream(sentence.split("\\W+")).reduce((x,y)->y+" "+x).stream().collect(Collectors.joining(" "));
//        System.out.println(collect);


//        Arrays.stream(word.split(""))
//                .collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()


//        String sentence1 = "my name is anas";
//        List<String> list = Arrays.stream(sentence1.split(" ")).map(x -> x.toUpperCase()).toList();
//        System.out.println(list);
//
//        String collect1 = Arrays.stream(sentence1.split(" "))
//                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//                .collect(Collectors.joining(" "));
//        System.out.println(collect1);






    }
}
