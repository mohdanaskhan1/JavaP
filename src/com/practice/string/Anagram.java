package com.practice.string;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        char[] c1 = s1.replaceAll("//s", "").toLowerCase().toCharArray();
        char[] c2 = s2.replaceAll("//s", "").toLowerCase().toCharArray();

        if (c1.length != c2.length) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : c1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : c2) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnnagram(s1, s2));
    }
}
