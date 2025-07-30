package com.Static;

public class Employee {
    private int eid;
    private String name;
    private int age;
    private int salary;
    private static int cid = 111222;

    public Employee(int eid, String name, int age, int salary) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cid=" + cid +
                '}';
    }
}
