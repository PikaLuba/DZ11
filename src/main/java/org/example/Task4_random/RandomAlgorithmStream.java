package org.example.Task4_random;

import java.util.stream.Stream;

public class RandomAlgorithmStream {
    public static void main(String[] args) {
        RandomAlgorithm r = new RandomAlgorithm(25214903917l, 11l, (long) Math.pow(2, 48) );
        Stream<Long> stream =
                Stream.iterate(9l, (seed) -> r.sp(seed).next()
                );
                stream
                        .limit(10)
                      //  .peek(System.out::println)
                        .forEach(System.out::println);

    }
}