package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        var areas = new HashMap<ShapeType, Double>();
        var perimeters = new HashMap<ShapeType, Double>();
        var colors = new HashMap<ShapeType, ShapeColor>();

        var rectangle = new Rectangle(4, 5);
        var circle = new Circle(3.4f);
        var triangle = new Triangle(3, 5, 7, 6);

        areas.put(ShapeType.RECTANGLE, (double)rectangle.getArea());
        areas.put(ShapeType.CIRCLE, (double)circle.getArea());
        areas.put(ShapeType.TRIANGLE, (double)triangle.getArea());

        colors.put(ShapeType.RECTANGLE, ShapeColor.RED);
        colors.put(ShapeType.CIRCLE, ShapeColor.BLUE);
        colors.put(ShapeType.TRIANGLE, ShapeColor.GREEN);

        perimeters.put(ShapeType.RECTANGLE, (double)rectangle.getPerimeter());
        perimeters.put(ShapeType.CIRCLE, (double)circle.getPerimeter());
        perimeters.put(ShapeType.TRIANGLE, (double)triangle.getPerimeter());


        printShapeInfo(rectangle);
        printShapeInfo(circle);

    }

    private static <T extends Shape & IAreaCalculable & IPerimeterCalculable>
    void printShapeInfo(T shape) {
        System.out.println(shape.getName());

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        System.out.println(shape.getName());

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}