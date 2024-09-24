package org.example;

public class Rectangle extends Shape implements IAreaCalculable, IPerimeterCalculable {
    private final float _width;
    private final float _height;

    public Rectangle(float width, float height){
        super(ShapeType.RECTANGLE);
        _width = width;
        _height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return _width * _height;
    }

    @Override
    public double getPerimeter() {
        return 2 * _width + _height;
    }
}


