package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static String question;
    private static String correctAnswer;
    private static String userAnswer;
    private static String userName;
    private static int counterCorrectUserAnswer;

    public static void isGCD() {
        userName = Greet.greetUser();
        Engine.printGameDescription(DESCRIPTION);

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            question = getGameQuestion();
            System.out.println("Question: " + question);

            userAnswer = Engine.getUserAnswer();
            correctAnswer = getCorrectAnswer(question);

            System.out.println("Your answer: " + userName);
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

        return firstNumber + " " + secondNumber;
    }

    public static String getCorrectAnswer(String question) {
        String[] questionParts = question.split(" ");
        int firstNumber = Integer.parseInt(questionParts[0]);
        int secondNumber = Integer.parseInt(questionParts[1]);

        /*
        Алгоритм нахождения НОД вычитанием
        - Из большего числа вычитаем меньшее.
        - Если получается 0, значит, числа равны друг другу и являются НОД (следует выйти из цикла).
        - Если результат вычитания не равен 0, то большее число заменяем на результат вычитания.
        - Переходим к пункту 1.
         */
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        return String.valueOf(firstNumber);
    }

}
