package com.DSAPractice;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mapc = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapc.put(c, mapc.getOrDefault(c, 0) + 1);
        }
        System.out.println(mapc);
        for (char c : t.toCharArray()) {
            if(!mapc.containsKey(c)){
                return false;
            }
            mapc.put(c,mapc.get(c)-1);
            if(mapc.get(c)<0){
                return false;
            }
        }
        System.out.println(mapc);
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
