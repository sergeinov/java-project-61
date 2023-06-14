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
            question = makeGameQuestion();
            System.out.println("Question: " + question);

            correctAnswer = getCorrectAnswer(question);

            System.out.print("Your answer:\s");
            userAnswer = Engine.getUserAnswer();
            if (correctAnswer.equalsIgnoreCase(userAnswer)) {
                Engine.printCorrectMessage();
                counterCorrectUserAnswer++;
            } else {
                Engine.printWrongAnswerMessage(userAnswer, correctAnswer);
            }
        }
        Engine.printResultMessage(userName, counterCorrectUserAnswer);
    }

    public static String getCorrectAnswer(int questionValue) {
        String answer = questionValue % 2 == 0 ? "yes" : "no";

        return answer;
    }

    private static int makeGameQuestion() {
        return Engine.getRandomNumber();
    }

}
