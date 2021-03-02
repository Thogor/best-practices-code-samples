package com.realdolmen.samples.thomasg.spliterator;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * WARNING: !This spliterator does not work!
 * Challenge: make it work and show your classmates
 */
public class AdvancedPetSpliterator implements Spliterator<Pet> {
    public static final int WINDOW_SIZE = 50;
    private final PetRepository petRepository;
    private final int lastRowToRetrieve;
    private int offset;

    public AdvancedPetSpliterator(PetRepository petRepository) {
        this(petRepository, 0, petRepository.countPets());
    }

    private AdvancedPetSpliterator(PetRepository petRepository, int offset, int lastRowToRetrieve) {
        this.petRepository = petRepository;
        this.offset = offset;
        this.lastRowToRetrieve = lastRowToRetrieve;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Pet> action) {
        List<Pet> pets = petRepository.findPets(offset, WINDOW_SIZE);
        pets.forEach(action);
        offset += pets.size();
        return offset < lastRowToRetrieve;
    }

    @Override
    public Spliterator<Pet> trySplit() {
        if (lastRowToRetrieve > offset + (WINDOW_SIZE * 4)) {
            offset = lastRowToRetrieve / 2;
            System.out.println("Split > offset: " + 0 + ", last: " + offset);
            return new AdvancedPetSpliterator(petRepository, 0, offset);
        } else {
            return null;
        }
    }

    @Override
    public long estimateSize() {
        return lastRowToRetrieve - offset;
    }

    @Override
    public int characteristics() {
        return 0;
    }
}
