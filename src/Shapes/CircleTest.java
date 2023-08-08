package Shapes;

import Util.Input;

public class CircleTest {
    public static void main(String[] ars) {
        Input input = new Input();
        do {
            System.out.println("enter a deciman number for the radius of a circle");
            double radius = input.getDouble();
            Circle myCircle = new Circle(radius);
            System.out.printf("the area of your circle is %.2f, the circumference is %.2f.%n", myCircle.getArea(), myCircle.getCircumference());
        }while (input.yesNo("would you like to create a new circle [y/n]"));
    }
}
