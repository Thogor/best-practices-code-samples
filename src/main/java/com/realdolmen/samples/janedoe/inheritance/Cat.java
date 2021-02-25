package com.realdolmen.samples.janedoe.inheritance;

public class Cat extends Pet {

    protected Cat(String name) {
        super(name);
    }

    @Override
    public void callForAttention() {
        System.out.println("Miauw");
    }
}
