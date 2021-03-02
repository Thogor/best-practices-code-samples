package com.realdolmen.samples.thomasg.spliterator;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SimplePetSpliterator implements Spliterator<Pet> {
    private final PetRepository petRepository;
    private int offset = 0;

    public SimplePetSpliterator(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Pet> action) {
        List<Pet> pets = petRepository.findPets(offset, 50);
        pets.forEach(action);
        offset = offset + pets.size();
        return pets.size() > 0;
    }

    @Override
    public Spliterator<Pet> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return 0;
    }

    @Override
    public int characteristics() {
        return 0;
    }
}
