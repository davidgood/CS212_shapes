package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        var map = new HashMap<ShapeType, Double>();

        var rectangle = new Rectangle(4, 5);
        var circle = new Circle(3.4f);

        System.out.println(rectangle.getName());
        map.put(ShapeType.RECTANGLE, (double)rectangle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(circle.getName());
        map.put(ShapeType.CIRCLE, (double)circle.getArea());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}