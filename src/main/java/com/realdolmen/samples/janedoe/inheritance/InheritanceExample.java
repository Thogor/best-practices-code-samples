package com.realdolmen.samples.janedoe.inheritance;

import java.util.List;

public class InheritanceExample {
    public static void main(String[] args) {
        Dog luna = new Dog("Luna");
        Cat tasha = new Cat("Tasha");
        List<Pet> pets = List.of(luna, tasha);
        pets.forEach(Pet::callForAttention);
    }
}
