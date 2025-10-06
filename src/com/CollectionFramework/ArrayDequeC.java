package com.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeC {
    public void AD(){
        Queue<Object> AD = new ArrayDeque<>();
        AD.add("ABC");
        AD.add("BCD");
        System.out.println(AD);
        System.out.println(AD.poll());
        System.out.println(AD);
        System.out.println(AD.peek());

    }
}
