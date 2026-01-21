package com.DSAPractice;

public class ProductofNTo1 {
    static int rec(int n){
        if(n==0){
            return 1;
        }
        return n*rec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(rec(5));

    }
}
