package org.example;

public class Line extends Shape implements IPerimeterCalculable {
    private final float _width;
    public Line(float width){
        super(ShapeType.LINE);
        _width = width;
    }

    @Override
    public String getName(){
        return "Line";
    }

    @Override
    public float getPerimeter() {
        return _width;
    }
}
