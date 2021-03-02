package com.realdolmen.samples.johndoe.equals;

public class Point implements Cloneable {

    private final int x;
    private final int y;
    private final int[] sizes = { 3, 5 };

    private class Nested {
        public int z; // Nothing wrong with making it public
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public boolean equals(Object obj) {

        if(!(obj instanceof Point))
            return false;

        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(x);
        result = 31 * result + Integer.hashCode(y);
        return result;
    }

    @Override
    protected Point clone() {

        try {
            Point point = (Point) super.clone();
            point.sizes.clone();
            return point;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
