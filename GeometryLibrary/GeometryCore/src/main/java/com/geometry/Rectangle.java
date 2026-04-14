package com.geometry;

public class Rectangle implements Geometry{
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Длина не может быть отрицательной: " + a + " - " + b);
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    public double getDiagonal () {
        return Math.hypot(a, b);
    }
}
