package com.DSAPractice;

import java.util.HashMap;

public class TwoSumUsingHasMap {
    public static void main(String[] args) {
        int[] integers = {1,2,3,4,5,6,7,8,9};
        int target = 11;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<integers.length; i++){
            int req = target - integers[i];
            if(map.containsKey(req)){
                System.out.println(map.get(req)+" "+i);
            }
            map.put(integers[i],i);
        }
    }
}
