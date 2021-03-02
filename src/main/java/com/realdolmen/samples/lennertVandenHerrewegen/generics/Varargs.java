package com.realdolmen.samples.lennertVandenHerrewegen.generics;

import java.util.ArrayList;
import java.util.List;

import static com.realdolmen.samples.lennertVandenHerrewegen.generics.Varargs.flatten;

public class Varargs {
    @SafeVarargs
    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();

        for (List<? extends T> list : lists)

            result.addAll(list);

        return result;
    }


}

class mainVarArg {
    public static void main(String[] args) {
        var audience = flatten(List.of("friends", "romans", "countrymen"));

    }
}
