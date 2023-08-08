package Util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.getString();
    }

//    String getString() {
//        System.out.println("Enter a word: ");
//        String response = scanner.nextLine();
//        System.out.println(response);
//        return response;
//    }

    public boolean yesNo() {
        return this.getString().trim().toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt() {
        try {
            return Integer.parseInt(this.getString());
        }catch (NumberFormatException e) {
            System.out.println("you must enter a whole number");
            return this.getInt();
        }
    }


    public int getInt(int min, int max) {
        int userInt = this.getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }else {
            System.out.printf("the number must be between %d and %d please try again.%n", min, max);
            return getInt();
        }
    }


    public double getDouble() {
        try {
            return Double.parseDouble(this.getString());
        }catch (NumberFormatException e) {
            System.out.println("you must enter a whole number");
            return this.getDouble();
        }
    }

    public double getDouble (double min, double max) {
        double userDouble = this.getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }else {
            System.out.printf("the number must be between %f and %f please try again.%n", min, max);
            return getDouble();
        }
    }

}
