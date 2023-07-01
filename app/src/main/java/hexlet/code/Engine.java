package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void game(String gameDescription, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameDescription);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            String answer = scanner.next();
            System.out.println("You answer: " + answer);
            if (answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

}
