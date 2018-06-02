package com.brainacad.oop.testshapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: "+getShapeColor()+", width="+width+", height="+height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }
}
