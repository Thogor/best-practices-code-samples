package com.realdolmen.samples.johndoe.equals;

public enum Color {

    BLUE("blue"),
    RED("red"),
    GREEN("green");

    public String name;

    private Color(String name) {
        this.name = name;
    }
}