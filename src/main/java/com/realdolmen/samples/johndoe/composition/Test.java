package com.realdolmen.samples.johndoe.composition;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("Snap", "crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
