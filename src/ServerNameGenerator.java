import java.util.Random;

public class ServerNameGenerator {

    static String[] adjectives = {
            "Zephyrific",
            "Quixotic",
            "Effervescent",
            "Serendipitous",
            "Mellifluous",
            "Luminous",
            "Susurrant",
            "Petrichor",
            "Incandescent",
            "Ephemeral"
    };

    static String[] nouns = {
            "Quokka",
            "Serendipity",
            "Mellotron",
            "Labyrinth",
            "Nebula",
            "Petrichor",
            "Aplomb",
            "Vellichor",
            "Mellowness",
            "Brouhaha"
    };

    public static String randomXboxName() {
        Random rand = new Random();
        int x = rand.nextInt(10);
        Random rand2 = new Random();
        int y = rand2.nextInt(10);
        return "Your Xbox UserName is: " + adjectives[x] + "-" + nouns[y] + ".";
    }

    public static void main(String[] args) {
        System.out.println(randomXboxName());
    }
}
