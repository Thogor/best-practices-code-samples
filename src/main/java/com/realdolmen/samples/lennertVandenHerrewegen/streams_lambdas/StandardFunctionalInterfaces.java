package com.realdolmen.samples.lennertVandenHerrewegen.streams_lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class StandardFunctionalInterfaces {

    public static Collection<String> makeLowerCase(String... s) {
        Objects.requireNonNull(s);
        return Arrays.stream(s).map(String::toLowerCase).collect(toList());
    }

    public static int minVal(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs) {
            if (arg < min)

                min = arg;
        }
        return min;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(StandardFunctionalInterfaces.makeLowerCase("Abc", "aBc", "a"));
        System.out.println(StandardFunctionalInterfaces.makeLowerCase("Abc"));
    }
}