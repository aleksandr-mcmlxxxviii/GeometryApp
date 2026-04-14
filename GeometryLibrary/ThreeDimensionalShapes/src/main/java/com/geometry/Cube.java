package com.geometry;

public class Cube implements Geometry {

    private final double a;

    public Cube(double a) {
        if (a < 0){
            throw new IllegalArgumentException("Длина не может быть отрицательной: " + a);
        }
        this.a = a;
    }

    @Override
    public double area() {
        return Math.pow(a, 2) * 6;
    }

    @Override
    public double perimeter() {
        return 12 * a;
    }

    public double spaceDiagonal() {
        return a * Math.sqrt(3);
    }
}
