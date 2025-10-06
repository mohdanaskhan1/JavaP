package com.CollectionFramework;
import java.util.*;
import java.util.Map.*;

public class MapC {
    public void MC(){

        HashMap hashMap = new HashMap(); //Non Generic
        HashMap<?, ?> hashMap1 = new HashMap<>();
        HashMap<Integer, String> hm1 = new HashMap<>(); //Generic
        hm1.put(1,"ABC");  //Entry Object
        hm1.put(2,"DEF");
        hm1.put(3,"GHI");
        System.out.println(hm1);


        Set<Entry<Integer, String>> entries = hm1.entrySet();
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public void car() {
        //1 pincode =>  5 cars
        // integer => List<String>
        ArrayList<String> area1 = new ArrayList<>();
        area1.add("ABC1");
        area1.add("ABC2");
        area1.add("ABC3");
        area1.add("ABC4");
        area1.add("ABC5");

        ArrayList<String> area2 = new ArrayList<>();
        area2.add("XBC1");
        area2.add("XBC2");
        area2.add("XBC3");
        area2.add("XBC4");
        area2.add("XBC5");
        ArrayList<String> area3 = new ArrayList<>();
        area3.add("YBC1");
        area3.add("YBC2");
        area3.add("YBC3");
        area3.add("YBC4");
        area3.add("YBC5");

        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        hashMap.put(110089, area1);
        hashMap.put(110085, area2);
        hashMap.put(110080, area3);

//        for ( Entry<Integer,List<String>> e : hashMap.entrySet()){
//            System.out.println("PINCODE : "+e.getKey());
//            for (String area : e.getValue()){
//                System.out.println(area);
//            }
//        }

        Set<Entry<Integer, List<String>>> entries = hashMap.entrySet();
        System.out.println(entries);
        Iterator<Entry<Integer, List<String>>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Entry<Integer, List<String>> next = iterator.next();
            System.out.println("PINCODE : "+next.getKey());
            List<String> value = next.getValue();
            for(String x : value){
                System.out.println(x);
            }
        }
    }

    }
