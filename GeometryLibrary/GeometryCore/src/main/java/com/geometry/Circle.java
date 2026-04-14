package com.geometry;

public class Circle implements Geometry{
    private final double r;

    public Circle(double r) {
        if (r < 0){
            throw new IllegalArgumentException("Радиус не может быть отрицательным: " + r);
        }
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * r * Math.PI;
    }

    public double getDiameter() {
        return 2 * r;
    }
}
