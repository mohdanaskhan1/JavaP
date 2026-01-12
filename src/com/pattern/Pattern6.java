package com.pattern;

public class Pattern6 {
        public static void main(String[] args) {
            for (int i = 0 ; i < 5 ; i++){
                int k = 5;
                for(int j = 5 ; j > i ; j--){
                    System.out.print(k);
                    k--;
                }
                System.out.println();
            }
        }
}