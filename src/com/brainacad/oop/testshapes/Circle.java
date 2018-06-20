package com.brainacad.oop.testshapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: "+getShapeColor()+", radius="+radius;
    }

    public static Circle parseCircle(String circleString) throws InvalidShapeStringException{
        String[] circleParts = circleString.split(":");
        String circleColor = circleParts[1];

        try {
            double radius = Double.parseDouble(circleParts[2]);
            return new Circle(circleColor,radius);
        } catch (NumberFormatException e) {
            throw new InvalidShapeStringException("radius is not defined");
        }

    }
}
