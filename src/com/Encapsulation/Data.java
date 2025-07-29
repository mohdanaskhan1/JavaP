package com.Encapsulation;
// DTO - DATA TRASFER OBJECT
// Bean Class(Spring), Entity Class,(HIbernate)
// Data Binding Encap
//MOdel (MVC Design)
//Plain Old Java Code


public class Data {
    private int id;
    private int age;
    private float height;
    private char c;
    private int weight;

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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
