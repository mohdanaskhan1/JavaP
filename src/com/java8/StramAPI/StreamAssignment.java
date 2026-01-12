package com.java8.StramAPI;

import com.sun.jdi.ObjectCollectedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAssignment {
    public static void main(String[] args) {
//        Q1
//        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> list = a.stream()
//                .filter(x -> x % 2 == 0)
//                .toList();
//        System.out.println(list);

//        Q2
//        List<String> list = Arrays.asList("mohd","anas","khan");
//        List<String> list2 = list.stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(list2);

//        Q3
//        List<String> list1 = Arrays.asList("a","","c","");
//        long count = list1.stream()
//                .filter(String::isEmpty)
//                .count();
//        System.out.println(count);

//        Q4
//        List<Integer> list = Arrays.asList(8, 5, 9, 3, 4, 1, 2);
//        List<Integer> list1 = list.stream().sorted().toList();
//        System.out.println(list1);
//        List<Integer> list2 = list.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//        System.out.println(list2);

//        Q5
//        List<Integer> list = Arrays.asList(10, 20, 40, 80, 90, 60, 50);
//        Integer i = list.stream()
//                .filter(x -> x > 50)
//                .sorted()
//                .findFirst()
//                .get();
//        System.out.println(i);

//        Q6
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Integer i = list.stream()
//                .reduce((x, y) -> (x + y))
//                .get();
//        System.out.println(i);

//        Q7
//        List<Integer> list = Arrays.asList(1, 2, 3 , 3, 4, 4, 5, 6, 7, 8, 9);
//        TreeSet<Integer> list1 = list.stream()
//                .map(i -> i * i)
//                .collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(list1);

//        Q8
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 3, 5);
//        Integer i = list.stream()
//                .sorted(Comparator.reverseOrder())
//                .findFirst()
//                .get();
//        System.out.println(i);

////        Q9
//        List<String> list = Arrays.asList("hello", "this", "is", "mohd", "anas");
//        String collect = list.stream().collect(Collectors.joining(" , "));
//        System.out.println(collect);

//        Q10
//        List<Integer> list = Arrays.asList(1, 2, -1, -2, 3, 4, 1, 4);
//        boolean b = list.stream().anyMatch(x -> x < 0);
//        System.out.println(b);

//        Q11
//        List<String> list = Arrays.asList("any", "many", "why", "next");
//        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(x -> x.length()));
//        System.out.println(collect);

//        Q12
//        List<String> list1 = Arrays.asList("anas","anas","khan");
//        Map<String, Long> collect1 = list1.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(collect1);

//        Q13
//        List<Integer> list = Arrays.asList(9, 10, 1, 9, 5, 3, 1, 2, 3, 1, 2, 4, 7, 8, 9, 3);
//        Set<Integer> collect = list.stream().collect(Collectors.toSet());
//        TreeSet<Integer> collect1 = list.stream().collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect);
//        System.out.println(collect1);

//        Q14
//        List<Integer> list = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 7, 8);
//        List<Integer> list1 = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//        System.out.println(list1);

//        Q15
//        List<Integer> list = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 7, 8);
//        Integer i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(i);

//        Q16
//        List<Integer> list = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 7, 8);
//        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy((x) -> x % 2 == 0));
//        System.out.println(collect);

//        Q17
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5),
//                Arrays.asList(6, 7, 8)
//        );
//        List<Integer> list = listOfLists.stream().flatMap(List::stream).toList();
//        System.out.println(list);


//        Q18
//        List<String> list = Arrays.asList("any", "many", "why", "next");
//        Double collect = list.stream().collect(Collectors.averagingDouble(String::length));
//        System.out.println(collect);

//        Q19
//        List<String> list = Arrays.asList("any", "many", "wh y", "next");
//        Set<Object> collect = list.stream().flatMap(s -> Arrays.stream(s.split(""))).filter(x -> !x.contains(" ")).collect(Collectors.toSet());
//        System.out.println(collect);

//        Q20
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", "IT"),
//                new Employee("Bob", "HR"),
//                new Employee("Charlie", "IT"),
//                new Employee("David", "Finance"),
//                new Employee("Eva", "HR")
//        );
//        Map<String, List<String>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(collect);


//        Q21
//        String para = "In the quiet of the night, a lone figure stood by the river, contemplating the mysteries of life. The stars twinkled above, casting a dreamy glow, while the river murmured beneath, a soothing soundtrack. As the moonlight filtered through the trees, it seemed as if the world was waiting to be discovered";
//        List<String> collect = Arrays.stream(para.split(" "))
//                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted((x, y) -> y.getValue().compareTo(x.getValue()))
//                .limit(3)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(collect);

//        Q22
//        String s = "In the quiet of the night, a lone figure stood by the river, contemplating";
//        List<String> list = Arrays.stream(s.split(" ")).toList();
//        String s3 = list.stream().sorted((s1, s2) -> s2.length() - s1.length()).limit(1).toList().getFirst();
//        System.out.println(s3);


//        Q22

//        Q24
//        List<Employee1> employees1 = Arrays.asList(
//                new Employee1("Alice", "IT", "Developer"),
//                new Employee1("Bob", "SUPPORT", "Tester"),
//                new Employee1("Charlie", "HR", "Recruiter"),
//                new Employee1("David", "IT", "Developer"),
//                new Employee1("Eva", "HR", "Manager")
//        );
//        Map<String, Map<String, List<Employee1>>> collect1 = employees1.stream()
//                .collect
//                        (Collectors.groupingBy(
//                                Employee1::getDepartment,
//                                Collectors.groupingBy
//                                        (Employee1::getRole
//                                        )));
//
//        System.out.println(collect1);

//        Q25
        List<Employee2> employees2 = Arrays.asList(
                new Employee2("Alice", "IT", 70000),
                new Employee2("Bob", "IT", 85000),
                new Employee2("Charlie", "HR", 60000),
                new Employee2("David", "Finance", 90000),
                new Employee2("Eva", "HR", 65000)
        );




    }

    static class Employee {
        private String name;
        private String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }

    static class Employee1 {
        private String name;
        private String department;
        private String role;

        public Employee1(String name, String department, String role) {
            this.name = name;
            this.department = department;
            this.role = role;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public String getRole() { return role; }

        @Override
        public String toString() { return name; }
    }

    static class Employee2 {
        private String name;
        private String department;
        private double salary;

        public Employee2(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return name + " (" + salary + ")";
        }
    }
}
