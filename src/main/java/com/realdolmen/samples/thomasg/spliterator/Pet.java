package com.realdolmen.samples.thomasg.spliterator;

public class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet: " + name;
    }
}
