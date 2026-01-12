package com.practice.streams;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {81, 9, 2, 10, 6, 1};
        int[] array = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
