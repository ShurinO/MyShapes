import com.brainacad.oop.testshapes.Circle;
import com.brainacad.oop.testshapes.Rectangle;
import com.brainacad.oop.testshapes.Shape;
import com.brainacad.oop.testshapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("GREEN");
        System.out.println(shape);
        System.out.println("Shape area is: "+shape.calcArea());

        Circle circle = new Circle("YELLOW",10);
        System.out.println(circle);
        System.out.printf("Shape area is: %.5f\n",circle.calcArea());

        Rectangle rectangle = new Rectangle("BLACK",11,22);
        System.out.println(rectangle);
        System.out.println("Shape area is: "+rectangle.calcArea());

        Triangle triangle = new Triangle("RED",5,5,5);
        System.out.println(triangle);
        System.out.printf("Shape area is: %.3f",triangle.calcArea());

    }
}
