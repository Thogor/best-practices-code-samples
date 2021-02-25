package com.realdolmen.samples.janedoe.inheritance;

public class Dog extends Pet {

    protected Dog(String name) {
        super(name);
    }

    @Override
    public void callForAttention() {
        System.out.println("Bark");
    }
}
