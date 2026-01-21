package com.DSAPractice;

import java.util.List;
import java.util.stream.Stream;

public class CountZeroInNumber {
    static int count1(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            count++;
        }
        return count1(num / 10, count);
    }

    public static void main(String[] args) {
        int num = 30204;
        long count1 = String.valueOf(Math.abs(num))
                .chars()
                .filter(c -> c == '0')
                .count();
        System.out.println(count1);
        List<Integer> iterate = Stream.iterate(Math.abs(num), n -> n > 0, n -> n / 10).map(n->n%10).toList();
        System.out.println(iterate);
        int count = 0;
        while (num != 0) {
            if (num % 10 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
        System.out.println(count1(30204, 0));

    }
}
