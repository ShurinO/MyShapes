package com.brainacad.oop.testshapes;

public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape, color is: " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public double calcArea(){
        return 0.0;
    }
}
