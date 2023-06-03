package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void isEven() {
        var counter = 0;
        var correctAnswer = 0;
        var randomNumber = 0;

        final String userName = Greet.greetUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        do {
            randomNumber = getRandomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");

            String answer = scanner.nextLine();
            if (answer.equals("yes") && ((randomNumber & 1) == 0)) {
                System.out.println("Correct!");
                correctAnswer++;
            } else if (answer.equals("no") & ((randomNumber & 1) != 0)) {
                System.out.println("Correct!");
                correctAnswer++;
            } else {
                if (answer.equals("yes")) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'no'.");
                } else if (answer.equals("no")) {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println(answer + " is wrong text! Type 'yes' or 'no'!");
                }
            }
            counter++;
        } while (counter != 3);

        if (correctAnswer == 3) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }

    private static int getRandomNumber() {
        // Генерируем случайное число от 1 до 100
        return random.nextInt(100) + 1;
    }

}
