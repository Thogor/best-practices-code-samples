package com.realdolmen.samples.johndoe.equals;

import java.util.Objects;

public class ColorPoint {

    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof ColorPoint))
            return false;

        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }


    @Override
    public int hashCode() {
        int result = point.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }
}