package com.practice.array;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,5,0,9,8,0,9};

        // {1,2,4,5,9,8,0,0,0,0}
        System.out.println(Arrays.toString(arr));
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[index++]=arr[i]; ///O(n)
            }
        }
        for(int i=index ; i<arr.length; i++){
            arr[index++]=0;   //O(n/2)
        }
        System.out.println(Arrays.toString(arr));


        //O(n) +O(n/2) == O(n)



    }
}