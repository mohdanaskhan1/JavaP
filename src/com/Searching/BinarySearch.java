package com.Searching;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1,3,4,5,7,8,9,15};
        int target = 15;
        int result = BSearch(num, target);
        if (num[result] == target){
            System.out.println(target + " found at index " + (result+1)  + " from " + Arrays.toString(num));
        }
        else {
            System.out.println("Not Found ");
        }
    }

    private static int BSearch(int[] num, int target) {
        int low = 0;
        int high = num.length - 1;
        while (low <= high){
            int mid = low + (high-low)/2 ;
            if (num[mid] == target){
                return mid;
            }
            else if (num[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
