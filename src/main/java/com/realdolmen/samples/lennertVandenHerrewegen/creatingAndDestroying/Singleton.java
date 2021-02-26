package com.realdolmen.samples.lennertVandenHerrewegen.creatingAndDestroying;

/*
Example of Static Factory method
a singleton class is a class that can have only one object (an instance of the class) at a time.
 */


public class Singleton {

    private static Singleton single_instance = null;

    public String welcomeSentence;

    private Singleton() {
        welcomeSentence = "Hello world!";
    }

    public static Singleton getInstance() {
        if (single_instance == null) single_instance = new Singleton();
        return single_instance;
    }
}

enum Singleton2 {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Elvis leaves the building");
    }
}

class mainSingleton {
    public static void main(String[] args) {
        Singleton2.INSTANCE.leaveTheBuilding();
    }
}