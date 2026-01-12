package com.DSAHighFrequency;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        //BRUTEFORCE O(n^2)
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1 ; j<nums.length; j++){
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }


        //Two Pointer Approach (Only for Sorted Array)

//        int left = 0;
//        int right = nums.length-1;
//        while (left<right){
//            int check = nums[left]+nums[right];
//            if (check>target) right--;
//            else if (check<target) left++;
//            else return new int[]{left,right};
//        }


        //Optimized Hashmap Approach - O(n)

        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int needed = target-current;
            if (seen.containsKey(needed)){
                return new int[]{seen.get(needed),i};
            }
            seen.put(nums[i],i);
        }


        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
