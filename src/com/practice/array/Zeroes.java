package com.practice.array;

import java.util.Arrays;

public class Zeroes {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 3, 0, 0, 4, 3};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
