package com.java8.FunctionalInterface;
import java.util.function.*;


public class PredicateC {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};

//        Predicate<Integer> predicate= new Predicate<Integer>(){
//            @Override
//            public boolean test(Integer element) {
//                return element%2==0;
//            }
//        };

        Predicate<Integer> predicate= (element) ->element%2==0;
        //predicate  - return boolean

        for (int element : num){
            boolean res = predicate.test(element);
            if(res){
                System.out.println(element);
            }
        }
    }
}
