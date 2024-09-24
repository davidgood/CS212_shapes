package org.example;

public class Circle extends Shape implements IAreaCalculable, IPerimeterCalculable {
    private float _radius;

    public Circle(float radius){
        super(ShapeType.CIRCLE);
        _radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return (float)Math.PI * _radius * _radius;
    }

    @Override
    public double getPerimeter(){
        return (float)(2 * Math.PI * _radius);
    }
}
