package com.realdolmen.samples.janolaerts.immutable;

public class Complex { // immutable class

    private final double re; // final fields
    private final double im; // final fields

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im); // returns new object -> immutable
    }

    public static Complex addOne(Complex c) {
        return new Complex(c.re + 1d, c.im + 1d); // returns new object -> immutable
    }
}
