package com.Searching;

public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length ; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[] = {1,3,4,5,7,8,9,15};
        int target = 15;
        int result = search(num, target);
        System.out.println(result);



    }
}
