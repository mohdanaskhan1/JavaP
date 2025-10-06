package com.Exception;

public class Launch {
    public static void main() {
        int age = 17;
        if (age<18){
            throw new InvalidAgeException("AGE LESS THAN 18");
        }
    }
}
