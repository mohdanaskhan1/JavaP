package com.DSAHighFrequency;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        //Recursion + Backtracking
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(),result);
        return result;


        //SwapCode
//        List<List<Integer>> result = new ArrayList<>();
//        backtrackS(nums, 0, result);
//        return result;

    }

        private static void backtrack(int[] nums, ArrayList<Integer> element, List<List<Integer>> result) {
        if(element.size() == nums.length){
            result.add(new ArrayList<>(element));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(element.contains(nums[i])) continue;
            element.add(nums[i]);
            backtrack(nums,element,result);
            element.remove(element.size() - 1);
        }
    }
//
//    private static void backtrackS(int[] nums, int index, List<List<Integer>> result) {
//        if (index == nums.length) {
//            ArrayList<Integer> permutation = new ArrayList<>();
//            for (int num : nums) permutation.add(num);
//            result.add(permutation);
//            return;
//        }
////        HashSet<Integer> used = new HashSet<>();
//        for (int i = index; i < nums.length; i++) {
////            if(used.contains(nums[i])) continue;
////            used.add(nums[i]);
//
//            swap(nums, index, i);
//            backtrackS(nums, index + 1, result);
//            swap(nums, index, i);
//        }
//    }

//    private static void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }
}
