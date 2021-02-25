package com.realdolmen.samples.janedoe.inheritance;

public abstract class Pet {
    private final String name;

    protected Pet(String name) {
        this.name = name;
    }

    public abstract void callForAttention();
}
