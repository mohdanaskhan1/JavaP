package com.DSAHighFrequency;

public class Factorial {
    public static int factR(int num){
        if (num <=0){
            return 1;
        }
        return num * factR(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factR(3));
        int fact = 1;
        for(int i=1; i<=3; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
