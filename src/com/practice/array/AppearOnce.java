package com.practice.array;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {
    public static void main(String[] args) {
//        You are given an array of integers where every element appears twice, except for one element which appears only once. Find that single element."
//        Input: [4, 1, 2, 1, 2]
//        Output: 4

        int[] arr = {4, 1, 2, 1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            if (entries.getValue().equals(1)) {
                System.out.println(entries.getKey());
            }
        }


        ////////////////////////


        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        System.out.println(result);

    }
}
