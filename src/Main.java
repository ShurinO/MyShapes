import com.brainacad.oop.testshapes.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Shape[] arr = {new Rectangle("Black",10,5)
                ,new Rectangle("Black",9,6)
                ,new Rectangle("Black",8,7)
                ,new Rectangle("Black",4,5)
                ,new Rectangle("Black",5,12)
                ,new Circle("Green",8.9)
                ,new Circle("Green",19.2)
                ,new Triangle("Red",3,4,5)
                ,new Triangle("Red",12,13,8)};
        for (Shape shape : arr) {
            shape.draw();
        }

        Shape rect1 = new Rectangle("Black",15,15);
        Shape rect2 = new Rectangle("Red",14,7);

        System.out.println("rect1.compareTo(rect2) = " + rect1.compareTo(rect2));
        System.out.println("rect2.compareTo(rect1) = " + rect2.compareTo(rect1));
        System.out.println("----------------------------------");
        Shape[] arr2 = {new Rectangle("Black",10,5)
                ,new Rectangle("Black",9,6)
                ,new Rectangle("Black",8,7)
                ,new Rectangle("Black",4,5)
                ,new Rectangle("Black",5,12)
                ,new Rectangle("Black",12,8)};
        Arrays.sort(arr2);
        for (Shape shape : arr2) {
            shape.draw();
        }
        System.out.println("-----------------SpecificComparator-----------------");
        Shape[] arr3 = {new Rectangle("Black",10,5)
                ,new Rectangle("Red",9,6)
                ,new Rectangle("Red",3,6)
                ,new Rectangle("White",8,7)
                ,new Rectangle("Pink",4,5)
                ,new Rectangle("Yellow",5,12)
                ,new Circle("Green",8.9)
                ,new Circle("Red",19.2)
                ,new Circle("Red",4.7)
                ,new Triangle("Black",3,4,5)
                ,new Triangle("Magenta",12,13,8)};
        Arrays.sort(arr3,new ShapeColorComparator());
        for (Shape shape : arr3) {
            shape.draw();
        }
        System.out.println("-----------------Java8Comparator-----------------");
        Arrays.sort(arr3,Comparator.comparing(Shape::getShapeColor).thenComparing(Comparator.comparing(Shape::calcArea).reversed()));
        for (Shape shape : arr3) {
            shape.draw();
        }

        System.out.println("---------------ParseShape-------------------");
        String[] shapeStrings = {"Rectangle:RED:10,20","Circle:BLACK:10","Rectangle:BLUE:4,15","Triangle:GREEN:9,7,12","Triangle:RED:4,6,22.2","Circle:YELLOW:6.7"};
        Shape[] shapes = new Shape[shapeStrings.length];
        for (int i = 0; i < shapeStrings.length; i++) {
            shapes[i] = Shape.parseShape(shapeStrings[i]);
        }
        for (Shape shape : shapes) {
            shape.draw();
        }


    }
}
