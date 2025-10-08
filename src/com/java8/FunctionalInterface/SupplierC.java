package com.java8.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierC {
    public static void main(String[] args) {
//        Supplier<String> stringSupplier = new Supplier<>() {
//            @Override
//            public String get() {
//                return "HELLO CUSTOM";
//            }
//        };

        Supplier<String> stringSupplier = ()->"HELLO CUSTOM";
        System.out.println(stringSupplier.get());
    }
}
