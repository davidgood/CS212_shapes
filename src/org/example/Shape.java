package org.example;

public abstract class Shape {
    private final ShapeType _shapeType;

    public Shape(ShapeType type){
        _shapeType = type;
    }

    public String getName() {
        return "Generic Shape";
    }

    public ShapeType getShapeType(){
        return _shapeType;
    }

}
