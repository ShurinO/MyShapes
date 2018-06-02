import com.brainacad.oop.testshapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("GREEN");
        System.out.println(shape);
        System.out.println("Shape area is: "+shape.calcArea());
    }
}
