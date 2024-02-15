package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Alpha", "Beta", "Gamma", "Zeta");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");

        Stream<String> result = zip(first, second);
        //Expect - Alpha, 1, Beta, 2, Gamma, 3

        result.peek(System.out::println).collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstItems = first.collect(Collectors.toList());
        List<T> secondItems = second.collect(Collectors.toList());

        int minSize = Math.min(firstItems.size(), secondItems.size());

        List<T> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            resultList.add(firstItems.get(i));
            resultList.add(secondItems.get(i));
        }

        return resultList.stream();
    }

}
