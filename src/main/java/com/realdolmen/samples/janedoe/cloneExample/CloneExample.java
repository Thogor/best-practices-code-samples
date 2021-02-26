package com.realdolmen.samples.janedoe.cloneExample;

import java.util.stream.IntStream;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Stack stackToClone = new Stack();
        Stack clonedStack = stackToClone.clone();
        System.out.println("Before Push " + stackToClone.getElements().length);
        System.out.println("Before Push " + clonedStack.getElements().length);

        IntStream.range(1, 20).forEach(i -> stackToClone.push(new Object()));

        System.out.println("After Push to stackToClone " + stackToClone.getElements().length);
        System.out.println("After Push to stackToClone " + clonedStack.getElements().length);
    }
}
