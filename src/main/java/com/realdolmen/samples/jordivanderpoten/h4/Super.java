package com.realdolmen.samples.jordivanderpoten.h4;

public class Super {

    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}