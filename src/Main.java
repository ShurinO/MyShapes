import com.brainacad.oop.testshapes.Circle;
import com.brainacad.oop.testshapes.Rectangle;
import com.brainacad.oop.testshapes.Shape;
import com.brainacad.oop.testshapes.Triangle;

public class Main {
    public static void main(String[] args) {
        /*Shape shape = new Shape("GREEN");
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
        System.out.printf("Shape area is: %.3f",triangle.calcArea());*/

        Shape[] arr = {new Rectangle("Black",10,5)
                ,new Rectangle("Black",9,6)
                ,new Rectangle("Black",8,7)
                ,new Rectangle("Black",4,5)
                ,new Rectangle("Black",5,12)
                ,new Circle("Green",8.9)
                ,new Circle("Green",19.2)
                ,new Triangle("Red",3,4,5)
                ,new Triangle("Red",12,13,8)};
        double sumArea = 0;
        for (Shape shape : arr) {
            double area = shape.calcArea();
            sumArea+=area;
            System.out.printf(shape+", area is: %.5f\n",area);
        }
        System.out.printf("All shapes total area: %.5f\n",sumArea);
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        for (Shape shape : arr) {
            double area = shape.calcArea();
            if (shape instanceof Rectangle){
                sumRectArea+=area;
            }else if (shape instanceof Circle){
                sumCircleArea+=area;
            }else if (shape instanceof Triangle){
                sumTriangleArea+=area;
            }
        }
        System.out.printf("Rectangles total area: %.5f\n",sumRectArea);
        System.out.printf("Circle total area: %.5f\n",sumCircleArea);
        System.out.printf("Triangle total area: %.5f\n",sumTriangleArea);

    }
}
