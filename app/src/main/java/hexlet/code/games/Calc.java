package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.getRandomNumber;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;
    private static Random random = new Random();

    public static void start() {
        var questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstNumber = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            String operator = getRandomOperator();

            String question = getGameQuestion(firstNumber, secondNumber, operator);
            String correctAnswer = calculateCorrectAnswer(firstNumber, secondNumber, operator);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.game(GAME_DESCRIPTION, questionsAndAnswers);
    }

    public static String getGameQuestion(int firstNumber, int secondNumber, String operator) {
        return firstNumber + " " + operator + " " + secondNumber;
    }

    public static String calculateCorrectAnswer(int firstNumber, int secondNumber, String operator) {
        int result = switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };

        return String.valueOf(result);
    }

    public static String getRandomOperator() {
        String[] OPERATORS = {"+", "-", "*"};
        int lengthArr = OPERATORS.length;

        return OPERATORS[random.nextInt(lengthArr)];
    }

}
