package com.realdolmen.samples.lennertVandenHerrewegen.commonMethods;

import java.util.Comparator;
import java.util.Objects;

public class Example implements Comparable<Example>, Cloneable {
    private String name;
    private String artist;
    private String duration;

    public Example(String name, String artist, String duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        Example that = (Example) o;
        return name.equals(that.name) && artist.equals(that.artist) && duration.equals(that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist, duration);
    }

    /**
     * Returns the string representation of this song .
     * In the format of x : Y [z:zz]
     * x: artist
     * y: number
     * z: duration (minutes : seconds)
     */
    @Override
    public String toString() {
        return artist + " : " + name + " [" + duration + "]";
    }

    /**
     * If the artist is the same order by name, else order by artist
     */

    @Override
    public int compareTo(Example other) {
        if (!this.artist.equalsIgnoreCase(other.artist))
            return this.artist.compareTo(other.artist);
        return this.name.compareTo(other.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }
}

class exampleMain {
    public static void main(String[] args) throws CloneNotSupportedException {

    }
}
