package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        var map = new HashMap<String, String>();


        var rectangle = new Rectangle(4, 5);
        var circle = new Circle(3.4f);
        var line = new Line(7.6f);

        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(circle.getName());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(line.getName());
        System.out.println(line.getPerimeter());
    }
}