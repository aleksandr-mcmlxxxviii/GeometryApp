package com.geometry;

public class Pyramid implements Geometry{
    private final double b;  // сторона основания (квадрат)
    private final double h;     // высота пирамиды

    public Pyramid(double b, double h) {
        if (b < 0 || h < 0) {
            throw new IllegalArgumentException("Сторона и высота не могут быть отрицательными");
        }
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        // Площадь полной поверхности = площадь основания + площадь боковых граней
        double baseArea = b * b;  // площадь квадрата

        // Апофема (высота боковой грани)
        double apothem = Math.sqrt(h * h + Math.pow(b / 2, 2));

        // Площадь одной боковой грани (треугольник) = (1/2) * сторона * апофема
        double sideArea = 4 * (0.5 * b * apothem);

        return baseArea + sideArea;
    }

    @Override
    public double perimeter() {
        // Сумма длин всех рёбер пирамиды
        // Для четырёхугольной пирамиды:
        // 4 ребра основания + 4 боковых ребра
        double sideEdge = Math.sqrt(h * h + Math.pow(b / 2, 2));
        return 4 * b + 4 * sideEdge;
    }
}
