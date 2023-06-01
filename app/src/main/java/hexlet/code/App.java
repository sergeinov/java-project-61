package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var invitetion = "Please enter the game number and press Enter.";
        var choice = """
                1 - Greet
                0 - Exit
                """;

        System.out.println(invitetion);
        System.out.println(choice);

        var answer = sc.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Your choice: " + answer);
                Cli.askName();
                break;
            default:
                System.out.println("Unknown game");
        }

    }
}
