package com.DSAHighFrequency;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> element = new ArrayList<>();
            element.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (!element.contains(nums[j])) {
                    element.add(nums[j]);
                    for (int k = 0; k < nums.length; k++) {
                        if (!element.contains(nums[k])) {
                            element.add(nums[k]);
                            lists.add(element);
                        }

                    }
                }
            }

        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }
}
