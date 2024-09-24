package org.example;

public class Triangle extends Shape implements IAreaCalculable, IPerimeterCalculable {
    private final double _sideA;
    private final double _sideB;
    private final double _sideC;
    private final double _height;

    public Triangle(double a, double b, double c, double height) {
        super(ShapeType.TRIANGLE);
        _sideA = a;
        _sideB = b;
        _sideC = c;
        _height = height;
    }

    @Override
    public float getArea(){
        return (float) (0.5 * (_sideA * _height));
    }

    @Override
    public float getPerimeter() {
        return (float) (_sideA + _sideB + _sideC);
    }
}
