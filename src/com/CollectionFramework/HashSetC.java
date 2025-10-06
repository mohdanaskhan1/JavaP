package com.CollectionFramework;

import java.util.HashSet;

public class HashSetC {

    public void Hs(){
        HashSet ob = new HashSet(); //Non-Generic
        HashSet<Object> ob1 = new HashSet<Object>();  //Generic - type safe Object
        HashSet<?> ob2 = new HashSet<>(); //Wild Card Generic - Only NULL

        ob1.add("raju");
        ob1.add(null);
        ob1.add("paju");
        ob1.add("kaju");
        ob1.add("maju");

        System.out.println(ob1);





    }
}
