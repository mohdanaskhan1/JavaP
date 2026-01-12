package com.practice;

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {1,23,0,3,0,0,0};
        System.out.println(Arrays.toString(zeroes(arr)));
    }
    public static int[] zeroes(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for (int i = index; i < arr.length; i++){
            arr[i]=0;
        }
        return arr;
    }
}
