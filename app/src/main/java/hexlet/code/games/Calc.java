package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static String correctAnswer = "";
    private static String userAnswer = "";
    private static int randomNumber = 0;
    private static int counterCorrectUserAnswer = 0;

    public static void isCalc() {
        String userName = Greet.greetUser();
        Engine.printGameDescription(GAME_DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            String question = getGameQuestion();
            System.out.println("Question: " + question);

            userAnswer = Engine.getUserAnswer();
            correctAnswer = countResult(question);

            if (userAnswer.equals(correctAnswer)) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                Engine.printWrongAnswerMessage(userAnswer, correctAnswer);
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

    public static String getGameQuestion() {
        int firstNumber = Engine.getRandomNumber();
        int secondNumber = Engine.getRandomNumber();
        String operator = Engine.getRandomOperator();

        return firstNumber + " " + operator + " " + secondNumber;
    }

    public static String countResult(String question) {
        String[] questionParts = question.split(" ");
        int firstNumber = Integer.parseInt(questionParts[0]);
        int secondNumber = Integer.parseInt(questionParts[2]);
        String operator = questionParts[1];
        int result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
        }
        return String.valueOf(result);
    }


}
