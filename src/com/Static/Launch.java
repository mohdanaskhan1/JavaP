package com.Static;

public class Launch {
    public static void main(String[] args) {
        Employee e1 = new Employee(11, "raju", 19, 19000);
        Employee e2 = new Employee(12, "kaju", 19, 19700);
        Employee e3 = new Employee(13, "maju", 20, 19400);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
}
