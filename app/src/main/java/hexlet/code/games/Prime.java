package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;

    public static void isPrime() {
        var questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int question = getGameQuestion();
            String correctAnswer = isPrime(question) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.game(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static boolean isPrime(int questionNumber) {
        // Натуральное число N является простым, если оно отлично от 1
        // и делится без остатка только на 1 и на само N
        if (questionNumber <= 1) {
            return false;
        }
        for (int delimiter = 2; delimiter < questionNumber / 2; delimiter++) {
            if (questionNumber % delimiter == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getGameQuestion() {
        return Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
    }

}
