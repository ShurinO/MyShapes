import com.brainacad.oop.testshapes.Circle;
import com.brainacad.oop.testshapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("GREEN");
        System.out.println(shape);
        System.out.println("Shape area is: "+shape.calcArea());

        Circle circle = new Circle("YELLOW",10);
        System.out.println(circle);
        System.out.println("Shape area is: "+circle.calcArea());


    }
}
