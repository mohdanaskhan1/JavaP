package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {
//        Write a Stream pipeline to find the average salary of employees in the 'IT' department.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "IT", 80000));
        employees.add(new Employee("Bob", "HR", 60000));
        employees.add(new Employee("Charlie", "IT", 90000));

        double v = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

//        Double collect = employees.stream()
//                .map(Employee::getSalary).collect(Collectors.averagingDouble(n -> n));

        System.out.println(v);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().filter(n -> n % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();

        Integer i = list.stream().filter(n -> n % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        Integer collect = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.summingInt(x -> x*x));


        System.out.println(collect);
        System.out.println(i);
        System.out.println(sum);


    }
}
