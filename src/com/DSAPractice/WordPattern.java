package com.DSAPractice;

import java.util.HashMap;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String s1 = arr[i];
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!s1.equals(map.get(c))) {
                    return false;
                }
            } else {
                if (map.containsValue(s1)) {
                    return false;
                }
                map.put(c, s1);
            }
        }
        return true;

    }


    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
