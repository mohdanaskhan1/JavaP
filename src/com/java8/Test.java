package com.java8;

import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        String str = null;
        String res = Optional.ofNullable(str).orElseThrow(()-> new RuntimeException("NOT FOUND"));
        res.substring(0);
//        str = str + null;
        System.out.println(res);
    }
}
