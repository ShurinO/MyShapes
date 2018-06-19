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

    public static Shape parseShape(String shapeString){
        String[] shapeParts = shapeString.split(":");
        switch (shapeParts[0]){
            case "Rectangle":
                String rectangleColor = shapeParts[1];
                String[] rectangleSizes = shapeParts[2].split(",");
                double a = Double.parseDouble(rectangleSizes[0]);
                double b = Double.parseDouble(rectangleSizes[1]);
                return new Rectangle(rectangleColor,a,b);
            case "Triangle":
                String triangleColor = shapeParts[1];
                String[] triangleSizes = shapeParts[2].split(",");
                double c = Double.parseDouble(triangleSizes[0]);
                double d = Double.parseDouble(triangleSizes[1]);
                double e = Double.parseDouble(triangleSizes[2]);
                return new Triangle(triangleColor,c,d,e);
            case "Circle":
                String circleColor = shapeParts[1];
                double radius = Double.parseDouble(shapeParts[2]);
                return new Circle(circleColor,radius);
            default:
                return new Rectangle("",0,0);
        }
    }
}
