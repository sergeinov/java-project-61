package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static Scanner scanner = new Scanner(System.in);

    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String answerName = scanner.nextLine();
        System.out.println("Hello, " + answerName + "!");

        return answerName;
    }

}
