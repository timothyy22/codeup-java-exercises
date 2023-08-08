package Util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

//        System.out.println("tell me a joke: ");
//        System.out.println(input.getString());

//        System.out.println(input.getString("tell me something"));
//
//        System.out.println("would you like to continue? [y/n] ");
//        System.out.println(input.yesNo());

//        System.out.println("Enter a number");
//        System.out.println(input.getInt());

//        System.out.println("enter a number between 10 - 20");
//        System.out.println(input.getInt(10, 20));

        System.out.println("enter a number between 1 - 10");
        System.out.println(input.getDouble(1, 10));

    }



}
