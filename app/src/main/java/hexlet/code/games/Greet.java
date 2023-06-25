package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;

    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");

        return userName;
    }

}
