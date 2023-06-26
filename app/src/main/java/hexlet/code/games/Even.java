package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.getRandomNumber;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;

    public static void start() {
        var questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int question = getGameQuestion();
            String correctAnswer = isEven(question) ? "yes" : "no";

            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.game(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static boolean isEven(int questionValue) {
        return questionValue % 2 == 0;
    }

    private static int getGameQuestion() {
        return getRandomNumber(MIN_NUMBER, MAX_NUMBER);
    }

}
