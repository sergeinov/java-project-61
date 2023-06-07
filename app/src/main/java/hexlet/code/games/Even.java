package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String correctAnswer;
    private static int counterCorrectUserAnswer;
    private static int question;
    private static String userAnswer;
    private static String userName;

    public static void isEven() {
        userName = Greet.greetUser();
        Engine.printGameDescription(GAME_DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = Engine.getRandomNumber();
            System.out.println("Question: " + question);

            userAnswer = Engine.getUserAnswer();
            correctAnswer = String.valueOf(question % 2 == 0 ? 1 : 0);

            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equalsIgnoreCase("yes") && correctAnswer.equals("1")) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else if (userAnswer.equalsIgnoreCase("no") && correctAnswer.equals("0")) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                if (userAnswer.equals("yes")) {
                    Engine.printWrongAnswerMessage(userAnswer, "no");
                } else if (userAnswer.equals("no")) {
                    Engine.printWrongAnswerMessage(userAnswer, "yes");
                }
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

}
