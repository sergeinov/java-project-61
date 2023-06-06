package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String correctAnswer = "";
    private static int counterCorrectUserAnswer = 0;
    private static int questionNumber = 0;
    private static String answer = "";

    public static void isEven() {
        String userName = Greet.greetUser();
        Engine.printGameDescription(GAME_DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            questionNumber = Engine.getRandomNumber();
            System.out.println("Question: " + questionNumber);

            answer = Engine.getUserAnswer();
            correctAnswer = String.valueOf(questionNumber % 2 == 0 ? 1 : 0);

            System.out.println("Your answer: " + answer);
            if (answer.equalsIgnoreCase("yes") && correctAnswer.equals("1")) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else if (answer.equalsIgnoreCase("no") && correctAnswer.equals("0")) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                if (answer.equals("yes")) {
                    Engine.printWrongAnswerMessage(answer, "no");
                } else if (answer.equals("no")) {
                    Engine.printWrongAnswerMessage(answer, "yes");
                }
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

}
