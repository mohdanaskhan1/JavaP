package com.DSAPractice;

public class ProductOfDigits {
    static int product(int num){
        if(num == 0){
            return 1;
        }
        return num%10 * product(num/10);
    }
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
}
