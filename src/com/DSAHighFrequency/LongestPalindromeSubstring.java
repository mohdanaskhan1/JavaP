package com.DSAHighFrequency;

import java.util.HashSet;

public class LongestPalindromeSubstring {

    public static String longestPalindrome(String s) {
//        for(int i=0; i<s.length(); i++){
//            for(int j=i+1; j<s.length(); j++ ){
//                String new1 = s.substring(i,j);
//                System.out.println(new1);
//            }
//        }

        int left = 0;
        int maxL = 0;
        int startIndex = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right=0; right<s.length(); right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            if (right - left + 1 > maxL) {
                maxL = right - left + 1;
                startIndex = left;
            }
        }
        System.out.println(s.substring(startIndex,startIndex+maxL));
        return null;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
