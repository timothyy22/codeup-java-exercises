package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

//    The code fails to compile if you leave off the getPerimeter method in the Rectangle class because the Rectangle class implements the Measurable interface, which requires the implementation of both getPerimeter and getArea methods. If you leave off any method that's required by an implemented interface, the class becomes incomplete and won't compile.
//
//    If you try to call the getLength or getWidth methods of the myShape variable, you will get a compilation error. This is because the myShape variable is of the type Measurable, which only defines the getPerimeter and getArea methods. The getLength and getWidth methods are specific to the Quadrilateral class and its subclasses (Rectangle and Square), and they are not part of the Measurable interface.








}
