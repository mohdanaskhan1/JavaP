package com.CollectionFramework;

import java.util.Stack;

public class StackC {
    public void st(){
        Stack st1 = new Stack(); // Generic
        Stack<Object> st2 = new Stack<Object>();
        Stack<?> st3 = new Stack<>();

        st2.push("H1");
        st2.push(123);
        st2.push(null);
        st2.push(123);

        System.out.println(st2);
        System.out.println(st2.peek());



    }
}
