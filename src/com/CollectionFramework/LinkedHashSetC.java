package com.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetC {


    public void Hs(){
        LinkedHashSet ob = new LinkedHashSet(); //Non-Generic
        LinkedHashSet<Object> ob1 = new LinkedHashSet<>();//Generic - type safe Object
        LinkedHashSet<?> ob2 = new LinkedHashSet<>();//Wild Card Generic - Only NULL

        ob1.add("raju");
        ob1.add(null);
        ob1.add("paju");
        ob1.add("kaju");
        ob1.add("maju");

        System.out.println(ob1);





    }
}
