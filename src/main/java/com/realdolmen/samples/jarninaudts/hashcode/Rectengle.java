package com.realdolmen.samples.jarninaudts.hashcode;

import java.util.Objects;

public class Rectengle implements Cloneable, Comparable<Rectengle>{
    private int length;
    private int width;

    public Rectengle() {
    }

    public Rectengle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize(){
        return length*width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectengle rectengle = (Rectengle) o;
        return length == rectengle.length && width == rectengle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "Rectengle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    protected Rectengle clone() throws CloneNotSupportedException {
        return (Rectengle) super.clone();
    }


    @Override
    public int compareTo(Rectengle o) {
        return this.getSize()-o.getSize();
    }
}
