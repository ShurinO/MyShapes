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

    public static Rectangle parseRectangle(String rectString){
        String[] rectParts = rectString.split(":");
        String rectangleColor = rectParts[1];
        String[] rectangleSizes = rectParts[2].split(",");
        double a = Double.parseDouble(rectangleSizes[0]);
        double b = Double.parseDouble(rectangleSizes[1]);
        return new Rectangle(rectangleColor,a,b);
    }
}
