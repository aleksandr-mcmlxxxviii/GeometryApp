package com.geometry;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Geometry{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Стороны не могут быть отрицательными");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    /**
     * Возвращает углы треугольника в градусах.
     * @return список из трёх углов: напротив сторон a, b, c соответственно
     */
    public List<Double> getAngles () {

        final List<Double> listAngles = new ArrayList<>();

        double alphaRad = safeAcos((b*b + c*c - a*a) / (2 * b * c));
        double betaRad  = safeAcos((a*a + c*c - b*b) / (2 * a * c));
        double gammaRad = safeAcos((a*a + b*b - c*c) / (2 * a * b));

        listAngles.add(Math.toDegrees(alphaRad));
        listAngles.add(Math.toDegrees(betaRad));
        listAngles.add(Math.toDegrees(gammaRad));

        return listAngles;
    }

    /**
     * Предотвращает IllegalArgumentException из-за погрешностей вычислений
     * если аргумент метода Math.acos() выходит за пределы [-1, 1].
     * @return угол в радианах
     */
    private static double safeAcos(double value) {
        if (value > 1.0) value = 1.0;
        if (value < -1.0) value = -1.0;
        return Math.acos(value);
    }
}
