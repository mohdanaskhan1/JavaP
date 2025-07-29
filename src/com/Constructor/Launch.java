package com.Constructor;

public class Launch {
    public static void main(String[] args) {
        Data data = new Data(5,8);
        System.out.println(data.getId() + " " + data.getAge());
        data.setId(10);
        data.setAge(18);

        System.out.println(data.getId() + " " + data.getAge());



    }
}
