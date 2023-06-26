package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_PROG_LENGTH = 10;
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;
    private static Random random = new Random();

    public static void isProgression() {
        var questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            int firstNumberProgression = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            int progressionStep = random.nextInt(MAX_PROG_LENGTH) + 1;
            int randomEmptyField = random.nextInt(MAX_PROG_LENGTH);

            String[] progression = getGameProgression(firstNumberProgression, progressionStep, MAX_PROG_LENGTH);

            questionsAndAnswers[i][1] = progression[randomEmptyField];         // save correct answer
            progression[randomEmptyField] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progression);
        }
        Engine.game(GAME_DESCRIPTION, questionsAndAnswers);
    }

    private static String[] getGameProgression(int firstNumberProgression, int progressionStep, int lengthArr) {
        String[] progressionArr = new String[MAX_PROG_LENGTH];

        progressionArr[0] = String.valueOf(firstNumberProgression);
        for (int i = 1; i < MAX_PROG_LENGTH; i++) {
            progressionArr[i] = String.valueOf(firstNumberProgression + progressionStep * i);
        }

        return progressionArr;
    }

}

