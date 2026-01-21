package com.DSAPractice;

public class PalindromeNumber {
    static boolean isPalindrome(int num) {
        System.out.println(reverse(num, 0));
        return num == reverse(num, 0);
    }

    static int reverse(int num, int target) {
        if (num == 0) {
            return target;
        }
        return reverse(num / 10, target * 10 + num % 10);
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println(isPalindrome(num));
    }
}
