package org.example;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> myList1 =
                Arrays.asList("Ivan", "Stefan", "Alex", "Peter", "John");

        myList1
                .stream()
                .map(String::toUpperCase)
                .sorted((h1,h2) -> (h2.compareToIgnoreCase(h1)))
                .forEach(System.out::println);

    }

}