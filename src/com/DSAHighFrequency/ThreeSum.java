package com.DSAHighFrequency;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        //BruteForce - O(n^3)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
//                        boolean contains = lists.contains(Stream.of(nums[i], nums[j], nums[k]).sorted().toList());
//                        if (!contains){
//                            lists.add(Stream.of(nums[i], nums[j], nums[k]).sorted().toList());
//                        }
//                    }
//                }
//            }
//        }

        //TwoPointer - with sorted array
//        Arrays.sort(nums);
//        int length = nums.length;
//        for(int i=0; i<length-3; i++){
//            if(i>0 && nums[i]==nums[i-1]){
//                continue;
//            }
//            int left = i+1;
//            int right = length-1;
//            while (left < right){
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum == 0){
//                    lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                    left++;
//                    right--;
//                    while (left<right && nums[left]==nums[left-1]){
//                        left++;
//                    }
//                    while (left<right && nums[right]==nums[right+1]){
//                        right--;
//                    }
//                } else if (sum < 0) {
//                    left++;
//                }else{
//                    right--;
//                }
//            }
//        }

        //HashSet Version O(n)
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i=0; i< nums.length; i++){
            HashSet<Integer> seen = new HashSet<Integer>();
            for(int j=i+1; j< nums.length ; j++){
                int needed = -nums[j]-nums[i];
                if(seen.contains(needed)){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], needed);
                    Collections.sort(triplet);
                    resultSet.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
//        return lists;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
