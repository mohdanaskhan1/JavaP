package com.Sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort {
    public static void main(String[] args) {
         int[] arr = {1,3,10,9,6,7,8,3};
        System.out.println("Before sorting: " + Arrays.toString(arr));
         int n = arr.length;
         boolean swap;
         for (int i = 0 ; i < n-1 ; i++ ){
             swap = false;
             for(int j = 0 ; j < n-i-1 ; j++){
                 if (arr[j] > arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     swap = true;
                 }
             }
             if (!swap) break;
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
