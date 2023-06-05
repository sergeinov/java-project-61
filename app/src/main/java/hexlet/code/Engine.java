package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static int getRandomNumber() {
        // Генерируем случайное число от 1 до 100
        return random.nextInt(100) + 1;
    }

    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        return operators[random.nextInt(operators.length)];
    }

    public static String getUserAnswer() {
        return scanner.nextLine();
    }

//    public boolean checkAnswer(String answer) {
//        if (answer.equals("yes") && (randomNumber % 2 == 0)) {
//            return true;
//        } else return answer.equals("no") && (randomNumber % 2 != 0);
//    }

    public static void printCorrectMessage() {
        System.out.println("Correct!");
    }

    public static void printGameDescription(String gameDescription) {
        System.out.println(gameDescription);
    }

    public static void printWrongAnswerMessage(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'.");

//        if (userAnswer.equals(correctAnswer)) {
//            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
//        } else if (userAnswer.equals("no")) {
//            System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
//        } else {
//            System.out.println("'" + userAnswer + "'" + " is wrong text! Type 'yes' or 'no'!");
//        }
    }
    public static void printResultMessage(String userName, int correctAnswer) {
        if (correctAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

}
