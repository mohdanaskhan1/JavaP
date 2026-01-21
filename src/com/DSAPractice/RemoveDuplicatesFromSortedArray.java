package com.DSAPractice;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index = 0;
        for(int point=1; point<nums.length; point++){
            if(nums[point]!= nums[index]){
                index++;
                nums[index] = nums[point];
            }
        }

        for(int point = index+1; point<nums.length; point++){
            nums[point]=0;
        }
        System.out.println(Arrays.toString(nums));
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
