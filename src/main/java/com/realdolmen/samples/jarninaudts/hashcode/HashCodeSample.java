package com.realdolmen.samples.jarninaudts.hashcode;

import com.realdolmen.samples.janedoe.inheritance.Cat;
import com.realdolmen.samples.janedoe.inheritance.Dog;
import com.realdolmen.samples.janedoe.inheritance.Pet;

import java.util.ArrayList;
import java.util.List;

public class HashCodeSample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectengle rectengle = new Rectengle(5,9);
        Rectengle rectengleClone = rectengle.clone();
        //rectengle.setLength(20);

        System.out.println("OG: " + rectengle);
        System.out.println("CL: " + rectengleClone);
        System.out.println("OG Hash: " + rectengle.hashCode());
        System.out.println("CL Hash: " + rectengleClone.hashCode());
        System.out.println("Equals: " + rectengle.equals(rectengleClone));

        List<Rectengle> rectengleList = new ArrayList<>();
        for(int i = 0;i <= 20; i++){
            rectengleList.add(new Rectengle((int)(Math.random() * 50 + 1),(int)(Math.random() * 50 + 1)));
        }

        System.out.println(rectengleList);
        rectengleList.sort(Rectengle::compareTo);
        System.out.println(rectengleList);

    }
}

