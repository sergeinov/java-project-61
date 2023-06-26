package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static String userName;

    public static void game(String gameDescription, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        printGameDescription(gameDescription);

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            String answer = scanner.next();
            System.out.println("You answer: " + answer);
            if (answer.equals(questionsAndAnswers[i][1])) {
                printCorrectMessage();
            } else {
                printWrongAnswerMessage(answer, questionsAndAnswers[i][1]);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        // Генерируем случайное число от 1 до 100
        return random.nextInt(maxNumber) + minNumber;
    }

    public static void printCorrectMessage() {
        System.out.println("Correct!");
    }

    public static void printGameDescription(String gameDescription) {
        System.out.println(gameDescription);
    }

    public static void printWrongAnswerMessage(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

}
