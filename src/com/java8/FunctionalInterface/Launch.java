package com.java8.FunctionalInterface;

public class Launch {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};

        Solution solution = new Solution() {
            public boolean logic(int element) {
                return element%2==0;
            }
        };


        Solution solution1 = (element)->element%2==0;

        for (int element : num){
            if (solution1.logic(element)){
                System.out.println(element);
            }
        }
    }
}
