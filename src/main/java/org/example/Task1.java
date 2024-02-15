package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {
     public static void main(String[] args) {
        AtomicInteger order = new AtomicInteger(1);
        List<String> myList =
                Arrays.asList("Ivan", "Stefan", "Peter", "Alex", "John");

        myList
                .stream()
                .map(s -> order.getAndIncrement() + ". " + s)
                .filter(s -> {
                    char s1 = s.charAt(0);
                    int i = s1 - '0';
                    return i % 2 != 0;
                })
                .forEach(System.out::println);
    }
}
