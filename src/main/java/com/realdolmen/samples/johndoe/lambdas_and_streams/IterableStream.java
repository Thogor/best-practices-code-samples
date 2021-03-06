package com.realdolmen.samples.johndoe.lambdas_and_streams;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterableStream {

    public static<E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    // Adapter from Iterable<E> to Stream<E>
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    public static void main(String[] args) {
            for(ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) {

            }
    }
}
