package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX_PROG_LENGTH = 10;
    private static String question;
    private static String correctAnswer;
    private static String userAnswer;
    private static String userName;
    private static int counterCorrectUserAnswer;
    private static String questionField = "..";

    public static void isProgression() {
        userName = Greet.greetUser();
        Engine.printGameDescription(DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = makeGameQuestion();
            System.out.println("Question: " + question);

            userAnswer = Engine.getUserAnswer();

            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                Engine.printWrongAnswerMessage(userAnswer, correctAnswer);
                break;
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

    private static String makeGameQuestion() {
        Random random = new Random();

        int firstNumberProgression = Engine.getRandomNumber();
        int progressionStep = random.nextInt(MAX_PROG_LENGTH) + 1;        // make random number from 1 to 10
        int randomEmptyField = random.nextInt(MAX_PROG_LENGTH);
        String[] progressionArr = new String[MAX_PROG_LENGTH];

        progressionArr[0] = String.valueOf(firstNumberProgression);
        for (int i = 1; i < MAX_PROG_LENGTH; i++) {
            progressionArr[i] = String.valueOf(firstNumberProgression + progressionStep * i);
        }

        correctAnswer = progressionArr[randomEmptyField];           // save correct answer
        progressionArr[randomEmptyField] = questionField;

        // example:  8 10 12 .. 16 18 20 22 24 26
        return String.join(" ", progressionArr);
    }

}

