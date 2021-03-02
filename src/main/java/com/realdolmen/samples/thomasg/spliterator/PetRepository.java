package com.realdolmen.samples.thomasg.spliterator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PetRepository {
    private final static int NR_OF_TOTAL_PETS = 1000;

    /**
     * Acts like a method used to retrieve a certain amount of pets from a database
     *
     * @param offset the index (rownum) of the first pet to retrieve from the 'database'
     * @param limit  the maximum amount of pet's that should be retrieved from the 'database'
     * @return A list of pets
     */
    public List<Pet> findPets(int offset, int limit) {
        System.out.printf("Searching for pets from %s to %s%n", offset, offset + limit);
        sleepForOneSecond(); // pretend that this is a very slow query
        return IntStream.range(offset, offset + limit)
                .filter(index -> index < NR_OF_TOTAL_PETS)
                .mapToObj(index -> new Pet("Luna (" + index + ")"))
                .collect(Collectors.toList());
    }

    public int countPets() {
        sleepForOneSecond(); // pretend that this is a very slow query
        return NR_OF_TOTAL_PETS;
    }

    private void sleepForOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Why does this exception exist?");
        }
    }
}
