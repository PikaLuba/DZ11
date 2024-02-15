package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {

        String[] array = {"1,2,0", "4,5"};
        Stream<String> streamOfArray = Arrays.stream(array);
        int[] ints =
        streamOfArray.map(s->s.split(",")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
