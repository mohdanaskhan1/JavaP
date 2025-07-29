package com.Constructor;

public class Data {
    //No Arg Constructor
    public Data(){
        this(10,5);

    }

    // Parameterized Constructor
    public Data(int id, int age) {
        this.id = id;
        this.age = age;
    }

    private int id;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
