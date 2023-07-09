package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;

    public static void start() {
        var questionsAndAnswers = new String[Engine.NUMBER_OF_ROUNDS][2];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            var secondNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

            String question = firstNumber + " " + secondNumber;
            String correctAnswer = String.valueOf(getCorrectAnswer(question));

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = correctAnswer;
        }
        Engine.runGame(GAME_DESCRIPTION, questionsAndAnswers);
    }

    public static int getCorrectAnswer(String questionValue) {
        String[] questionParts = questionValue.split(" ");
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
        return firstNumber;
    }

}
