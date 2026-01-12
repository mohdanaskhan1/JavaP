package com.java8;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launch {
    public static void main(String[] args) {
//        int[] a1 = {1,3,4,2,5,7};
//        int[] a2 = {2,5,4,1,3,7};
//
//        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
//        String sentence = "Hello My Age is 10.3 and this is";
//        String stream = Arrays.stream(sentence.split(" "))
//                .map(s-> {
//                    if (s.endsWith(".")){
//                        return s.substring(0,s.length()-1);
//                    }
//                    return s;
//                })
//                .reduce((a,b)-> (b + " " +a))
//                .map(s->{
//                    if(sentence.endsWith(".")){
//                        return s+".";
//                    }
//                    return s;
//                })
//                .orElseThrow();
//        System.out.println(stream);


        String word = "abbbaas";
        String s = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
        System.out.println(s);


        Set<String> seen = new HashSet<>();
        String secondRecurring = Arrays.stream(word.split(""))
                .filter(c -> !seen.add(c))  // keep only characters that are already in 'seen'
                .skip(1)                    // skip the first recurring character
                .findFirst()                // get the second recurring
                .orElseThrow();

        System.out.println(secondRecurring);
    }
}
