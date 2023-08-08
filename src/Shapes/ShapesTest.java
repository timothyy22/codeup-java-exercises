package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + myShape.getArea());
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());

        myShape = new Squares(4, 4);
        System.out.println("Square Area: " + myShape.getArea());
        System.out.println("Square Perimeter: " + myShape.getPerimeter());
    }
}
