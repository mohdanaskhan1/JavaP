package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Q21 {
    public static void main(String[] args) {
        String paragraph = """
            This is a test paragraph. This paragraph is used for testing.
            The paragraph is designed to test various string operations.
            This is just a test!
            """;

        // Split the paragraph into words, count frequencies, sort by frequency, and return as a List.
        List<String> list = Arrays.stream(paragraph.split("\\W+"))  // Split by non-word characters
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))  // Count frequency of each word
                .entrySet()  // Convert to a set of entries (word, count)
                .stream()  // Stream1 of the entries
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue()))  // Sort by frequency in descending order
                .map(Map.Entry::getKey)
                .limit(3)// Extract the word
                .toList();  // Collect to a List

        System.out.println(list);
    }
}
