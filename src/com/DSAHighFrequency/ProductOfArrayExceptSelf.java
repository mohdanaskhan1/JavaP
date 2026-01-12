package com.DSAHighFrequency;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        //Bruteforce - O(n^2)
//        for (int i = 0; i < nums.length; i++) {
//            int element = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                }
//                element = element * nums[j];
//            }
//            result[i] = element;
//        }

        //Optimized Approach (Prefix / Suffix)- O(n)
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }
        int suffix = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] = result[j] * suffix;
            suffix = suffix * nums[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
