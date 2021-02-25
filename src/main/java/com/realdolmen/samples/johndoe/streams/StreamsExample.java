package com.realdolmen.samples.johndoe.streams;

import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List.of("1", "3", "2", "4")
                .stream()
                .map(Short::parseShort)
                .filter(number -> number < 4)
                .sorted()
                .forEach(System.out::println);
    }
}
