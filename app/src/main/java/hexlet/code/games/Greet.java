package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;

    public static String greetUser() {
        System.out.println("\nWelcome to the Brain Games!\nMay I have your name? ");

        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public static String getUserName() {
        return userName;
    }


}
