package com.brainacad.oop.testshapes;

public abstract class Shape implements Drawable, Comparable<Shape>{
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

    @Override
    public void draw() {
        System.out.printf(toString()+", area is: %.5f\n",calcArea());
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(calcArea(),o.calcArea());
    }

    public abstract double calcArea();
}
