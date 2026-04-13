package com.geometry;

import com.geometry.exception.NoPerimeterException;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 10);
        Triangle triangle = new Triangle(100, 100, 100);

        System.out.println();
        System.out.println("Круг площадь 2D: " + circle.area());
        System.out.println("Круг периметр 2D: " + circle.perimeter());
        System.out.println("Круг периметр 2D: " + circle.getDiameter());

        System.out.println();
        System.out.println("Прямоугольник площадь 2D: " + rectangle.area());
        System.out.println("Прямоугольник периметр 2D: " + rectangle.perimeter());

        System.out.println();
        System.out.println("Треугольник площадь 2D: " + triangle.area());
        System.out.println("Треугольник периметр 2D: " + triangle.perimeter());

        System.out.println();
        System.out.println("Класс объекта чья площадь больше: " + Utils.getMaxArea(circle, rectangle, triangle).getClass().getName());

        System.out.println();
        System.out.println("Результат сравнения объектов: " + Utils.compareArea(circle, rectangle));

        Cube cube = new Cube(5);
        Pyramid pyramid = new Pyramid( 5, 10);
        Sphere sphere = new Sphere(10);

        System.out.println();
        System.out.println("Куб площадь 3D: " + cube.area());
        System.out.println("Куб периметр(сумма длин всех ребер) 3D: " + cube.perimeter());

        System.out.println();
        System.out.println("Пирамида площадь 3D: " + pyramid.area());
        System.out.println("Пирамида периметр(сумма длин всех ребер) 3D: " + pyramid.perimeter());

        System.out.println();
        System.out.println("Сфера площадь 3D: " + sphere.area());
        try {
            System.out.println("sphere периметр 3D: " + sphere.perimeter());
        } catch (NoPerimeterException e) {
            System.err.println(e.getMessage());
        }
    }
}
