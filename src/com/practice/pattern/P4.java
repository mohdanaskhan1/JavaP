package com.practice.pattern;

import javax.xml.transform.Source;

public class P4 {
    public static void main(String[] args) {
        for(int i=0; i<5 ; i++){
            for(int j=4; j>i ; j--){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<4; i++){
            for(int j=0; j<i+1 ; j++){
                System.out.print("_");
            }
            for(int j=5; j>i*2+1; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
