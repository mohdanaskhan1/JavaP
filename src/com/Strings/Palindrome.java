package com.Strings;

public class Palindrome {
    public String P1(String s1){
        int a = 0;
        int b = s1.length()-1;
        String s2 = s1.toLowerCase();
        while(a<b){
            if (s2.charAt(a)!=s2.charAt(b)){
                return " Not Palindrome";
            }
            a++;
            b--;
        }
        return "Palindrome";
    }
}
