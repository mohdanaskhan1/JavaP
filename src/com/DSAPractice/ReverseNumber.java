package com.DSAPractice;

public class ReverseNumber {
    static int revR(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return revR(num / 10, rev * 10 + num % 10);
    }

    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(revR(1234, 0));
        System.out.println(reverse(1234, 0));
    }
}
