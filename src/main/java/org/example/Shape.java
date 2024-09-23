package org.example;

public abstract class Shape {
    private ShapeType _shapeType;

    public String getName() {
        return "Generic Shape";
    }

    public ShapeType getShapeType(){
        return _shapeType;
    }

}
