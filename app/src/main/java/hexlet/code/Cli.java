package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void askName() {
        System.out.println("May I have your name?");

        Scanner sc = new Scanner(System.in);
        String answerName = sc.nextLine();

        System.out.println("Hello, " + answerName + "!");
    }

}
