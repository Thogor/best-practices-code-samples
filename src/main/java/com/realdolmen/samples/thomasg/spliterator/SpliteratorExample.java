package com.realdolmen.samples.thomasg.spliterator;

import java.util.stream.StreamSupport;

public class SpliteratorExample {
    public static void main(String[] args) {
        PetRepository petRepository = new PetRepository();

//        SimplePetSpliterator simplePetSpliterator = new SimplePetSpliterator(petRepository);
//        StreamSupport.stream(simplePetSpliterator, false)
//                .forEach(System.out::println);

        // TODO: fix the issues in AdvancedPetSpliterator before uncommenting this code block
        AdvancedPetSpliterator advancedPetSpliterator = new AdvancedPetSpliterator(petRepository);
        StreamSupport.stream(advancedPetSpliterator, true)
                .forEach(System.out::println);
    }
}
