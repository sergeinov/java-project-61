package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static int question;
    private static String correctAnswer;
    private static String userAnswer;
    private static String userName;
    private static int counterCorrectUserAnswer;

    public static void isPrime() {
        userName = Greet.greetUser();
        Engine.printGameDescription(DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = makeGameQuestion();
            System.out.println("Question: " + question);

            userAnswer = Engine.getUserAnswer();
            correctAnswer = getCorrectAnswer(question);

            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                Engine.printWrongAnswerMessage(userAnswer, correctAnswer);
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

    private static String getCorrectAnswer(int questionNumber) {
        // Натуральное число N является простым, если оно отлично от 1
        // и делится без остатка только на 1 и на само N
        if (questionNumber < 2) {
            return "no";
        }
        for (int i = 2; i < questionNumber / 2; i++) {
            if (questionNumber % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    private static int makeGameQuestion() {
        return Engine.getRandomNumber();
    }

}
