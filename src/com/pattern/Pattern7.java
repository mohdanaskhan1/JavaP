package com.pattern;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int l = 5-i;
            for(int j=5;j>i+1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i = 0 ; i < 4 ; i++){
            int l = i+2;
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print(" ");
            }
            for(int j = 4 ; j > i ; j--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
