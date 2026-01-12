package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,10,9,6,7,8,3};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++){
            int min = i;
            for (int j=i+1 ; j<n ; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting: " + Arrays.toString(arr));

    }
}
