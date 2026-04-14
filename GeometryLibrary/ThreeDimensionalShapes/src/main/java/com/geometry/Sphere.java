package com.geometry;

import com.geometry.exception.NoPerimeterException;

public class Sphere implements Geometry{
    private final double r;

    public Sphere(double r) {
        if (r < 0){
            throw new IllegalArgumentException("Радиус не может быть отрицательным: " + r);
        }
        this.r = r;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        throw new NoPerimeterException ("У шара нет периметра");
    }
}
