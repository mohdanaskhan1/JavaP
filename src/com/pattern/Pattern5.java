package com.pattern;

//        12345
//        1234
//        123
//        12
//        1

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++){
            int k = 1;
            for(int j = 5 ; j > i ; j--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
