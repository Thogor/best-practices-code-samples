package com.realdolmen.samples.angelocarly.solid.generics;

public class GenericsExample {


    public static void main(String[] args) {
        GenericLinkedNode<String> head = createExampleLinkedList();

        printLinkedList(head);
    }

    private static GenericLinkedNode<String> createExampleLinkedList() {
        GenericLinkedNode<String> head = new GenericLinkedNode<>("Test");

        GenericLinkedNode<String> index = head;
        for(int i = 0; i < 10; i++) {
            GenericLinkedNode<String> newNode = new GenericLinkedNode<>("Body");
            index.setNext(newNode);
            index = newNode;
        }

        return head;
    }

    private static <T> void printLinkedList(GenericLinkedNode<T> node) {
        GenericLinkedNode<T> index = node;
        while (index != null) {
            System.out.println(index.getData());
            index = index.getNext();
        }
    }

}
