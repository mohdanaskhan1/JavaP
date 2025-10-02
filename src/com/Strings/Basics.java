package com.Strings;

import java.util.Scanner;

public class Basics {
    public void Basic(){
        String name = "raju";
        String name1 = "raju";
        // "raju" -> String Literal
        // name -> variable
        // String -> dta type [non primitive] , java.lang.String

        String fame = new String("raju");
        String fame1 = new String("raju");

        System.out.println(fame);

        if (fame == fame1){ //checks refrences
            System.out.println("EQ");
        }
        else if (fame.equals(fame1)){ //checks data
            System.out.println("EQ");
        }
        else{
            System.out.println("NEQ");
        }

        //STRING METHODS
        //1. concat (returns String)
        String concat = name.concat("kaju1");
        System.out.println(concat);
        System.out.println(name);

        //2. equals (return Boolean) //don't check references checks content
        Boolean a = name.equals(fame);
        System.out.println(a);

        String s = "Hello 123 @&#(*";
//        char c[]= new char[s.length()];
//        for (int i=0; i<s.length();i++){
//            c[i]=s.charAt(i);
//        }
        char c[]= s.toCharArray();
        for (char ch :c){
            System.out.println(ch);
        }


        String e = "abc@gmail.com";
        boolean b = e.endsWith("@gmail.com");
        byte[] bytes = s.getBytes();
        System.out.println(b);
        for (int b1 : bytes){
            System.out.println(b1);
        }





    }
}
