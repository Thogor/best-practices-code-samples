package com.realdolmen.samples.lennertVandenHerrewegen.streams_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.realdolmen.samples.lennertVandenHerrewegen.streams_lambdas.StreamPractice.transform;
import static java.util.Arrays.asList;

public class StreamPractice {
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).filter(name -> name.length() > 5).mapToInt(String::length).sum();
    }

    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        return collection.stream().flatMap(value -> value.stream()).collect(Collectors.toList());
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparing(Person::getAge)).get();
    }

}

class PracticeMain {
    public static void main(String[] args) {
        var result = StreamPractice.getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
        System.out.println(result + " = 14");

        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        System.out.println(transform(collection));

        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, eva, viktor);
        System.out.println(StreamPractice.getOldestPerson(people).getAge() + " = 42");
    }
}

class Person {

    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age) {
        this(name, age, "");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}
