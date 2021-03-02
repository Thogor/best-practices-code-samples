package com.realdolmen.samples.johndoe.generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // The elements array will contain only E instances from push(E)
    // The runtime type will always be Object[], since generic types are removed at runtime
    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for(String arg : args)
            stack.push(arg);

        while(!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if(size == 0) throw new EmptyStackException();

        // push requires elements to  be of type E, so cast is correct
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];

        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
