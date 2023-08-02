import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("hi im bob talk to me");
            Scanner bobConvo = new Scanner(System.in);
            String talk = bobConvo.nextLine();

            if (talk.endsWith("!")) {
                System.out.println("calm down bud...");
            } else if (talk.endsWith("?")) {
                System.out.println("not sure dude");
            } else if (talk.endsWith("")) {
                System.out.println("fine i didnt want to talk either");
            } else {
                System.out.println("later loser");
            }
            System.out.println("would you like to continue [y/n]");
            userInput = start.nextLine();
        }while (userInput.equals( "y"));
    }
}
