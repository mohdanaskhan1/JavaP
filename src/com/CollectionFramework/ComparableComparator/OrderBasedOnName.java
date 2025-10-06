package com.CollectionFramework.ComparableComparator;

import java.util.Comparator;

public class OrderBasedOnName implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
        // ABC1 ---compareTo--- ABC2
        //97
    }
}
