package com.DSAPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountFrequencyOfCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        String a = "mississippi";
        for(char c : a.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
