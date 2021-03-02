package com.realdolmen.samples.jarninaudts.generics;

import java.util.List;
import java.util.stream.Stream;

public class Run {
    public static void main(String[] args) {
        List<Number> numberList = List.of(1,5,8,9,6,3,5,7,8,9);
        List<Integer> integerList = List.of(1,5,8,9,6,3,5,7,8,9);
        Chooser<Number> chooser = new Chooser<>(integerList);

        System.out.println(chooser.choose());

        Stream<Integer> stream = Stream.of(1,5,8,9,6,3,5,7,8,9);
        stream.forEach(
                System.out::println
        );

    }
}
