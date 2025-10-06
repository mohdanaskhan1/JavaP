package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class ArrayListC {

    public void AL(){
        //Non Generic
        @SuppressWarnings("rawtypes")
        ArrayList a1 = new ArrayList();
        a1.add("Hello");
        a1.add(123);
        System.out.println(a1);

        //Generic - String (Type Safety)
        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("h1");
        a2.add("h2");
        System.out.println(a2);

        //Generic - Object ( Type Safety)
        ArrayList<Object> a3 = new ArrayList<Object>();
        a3.add("abc");
        a3.add(123);
        a3.add(null);
        a3.add(false);
        System.out.println(a3);

        // Wild Card ArrayList
        //Read Only Later
        ArrayList<?> a4 = new ArrayList<>();
        a4.add(null);
        System.out.println(a4);

        //For loop to iterate Array List
//        for (int i=0; i<a3.size();i++){
//            System.out.println(a3.get(i));
//        }
//
        //For each loop to iterate Array List
//        for (Object o : a3){
//            System.out.println(o);
//        }

        // Iterator to iterate Arraylist
//        Iterator<Object> objectIterator = a3.iterator();
//        while (objectIterator.hasNext()){
//            System.out.println(objectIterator.next());
//        }


    }
}
