package com.geometry;

public class Utils {

    public static Geometry getMaxArea(Geometry... shapes) {
        if (shapes.length == 0) return null;
        Geometry max = shapes[0];
        for (Geometry shape : shapes) {
            if (shape.area() > max.area()) {
                max = shape;
            }
        }
        return max;
    }

    public static int compareArea(Geometry g1, Geometry g2) {
        return Double.compare(g1.area(), g2.area());
    }
}
