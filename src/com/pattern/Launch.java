package com.pattern;

import java.util.Arrays;

public class Launch {
    public static void main(String[] args) {
        // 1,0,21,0,3,0,0,0,49,0,5
        int[] arr = {1, 0, 21, 0, 3, 0, 0, 0, 49, 0, 5};
        int[] result = moveZeroes(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] moveZeroes(int[] arr){
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if ( arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i<arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }
}