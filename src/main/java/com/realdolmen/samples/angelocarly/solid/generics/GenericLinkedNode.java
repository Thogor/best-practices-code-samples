package com.realdolmen.samples.angelocarly.solid.generics;

public class GenericLinkedNode<T> {

    private T data;

    private GenericLinkedNode<T> next;

    public GenericLinkedNode(T data) {
        this(data, null);
    }

    public GenericLinkedNode(T data, GenericLinkedNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(GenericLinkedNode<T> next) {
        this.next = next;
    }
}
