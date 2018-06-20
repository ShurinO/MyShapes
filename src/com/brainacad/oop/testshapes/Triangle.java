package com.brainacad.oop.testshapes;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    @Override
    public String toString() {
        return "This is Triangle, color: "+getShapeColor()+", a="+a+", b="+b+", c="+c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static Triangle parseTriangle(String triangleString) throws InvalidShapeStringException {
        String[] triangleParts = triangleString.split(":");
        String triangleColor = triangleParts[1];
        String[] triangleSizes = triangleParts[2].split(",");
        try {
            double x = Double.parseDouble(triangleSizes[0]);
            double y = Double.parseDouble(triangleSizes[1]);
            double z = Double.parseDouble(triangleSizes[2]);
            return new Triangle(triangleColor,x,y,z);
        }catch (NumberFormatException|ArrayIndexOutOfBoundsException e) {
            throw new InvalidShapeStringException("radius is not defined");
        }

    }
}
