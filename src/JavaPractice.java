import java.util.Scanner;

public class JavaPractice {


    public static int[] countVowels(String word) {
        int[] vowelCount = new int[5];
        word = word.toLowerCase(); // Convert the word to lowercase
        for (int x = 0; x < word.length(); x++) {
            char c = word.charAt(x);
            if (c == 'a') {
                vowelCount[0]++;
            } else if (c == 'e') {
                vowelCount[1]++;
            } else if (c == 'i') {
                vowelCount[2]++;
            } else if (c == 'o') {
                vowelCount[3]++;
            } else if (c == 'u') {
                vowelCount[4]++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int[] vowelCounts = countVowels(word);

        System.out.println("|======== VOWEL COUNT ========|");
        System.out.println("| A's | E's | I's | O's | U's |");
        System.out.println("|=============================|");
        System.out.print("|");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + vowelCounts[i] + "   |");
        }
        System.out.println("\n|=============================|");

        scanner.close();
    }


//    p

}