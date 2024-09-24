package org.example;

public class Triangle extends Shape implements IAreaCalculable, IPerimeterCalculable {
    private final double _sideA;
    private final double _sideB;
    private final double _sideC;
    private double _height;

    public Triangle(double a, double b, double c) {
        super(ShapeType.TRIANGLE);
        _sideA = a;
        _sideB = b;
        _sideC = c;

        if (!validateDimensions(a, b, c))
            return; // Ugh.

        calculateHeight();
    }

    private boolean validateDimensions(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private void calculateHeight() {
        double area = getArea();
        _height = (2 * area) / _sideA;  // using side 'a' as the base
    }

    @Override
    public double getArea(){
        double s = (_sideA + _sideB + _sideC) / 2;  // semi-perimeter
        return Math.sqrt(s * (s - _sideA) * (s -_sideB) * (s - _sideC));
    }

    @Override
    public double getPerimeter() {
        return _sideA + _sideB + _sideC;
    }

}
