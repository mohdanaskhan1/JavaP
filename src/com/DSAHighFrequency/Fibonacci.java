package com.DSAHighFrequency;
//find nth fibonacci number

public class Fibonacci {
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i=0; i<n; i++){
            int temp = a;
            a = b;
            b = temp + a;
        }
        return a;
    }

    public static int fibr(int n){
        if(n<=1){
            return n;
        }
        return fibr(n-1)+fibr(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibr(7));
    }
}
