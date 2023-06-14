package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Greet;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var invitetion = "Please enter the game number and press Enter.";
        var choiceAnswer = "Your choice: ";
        var unknownAnswer = "Unknown game";
        var choice = """
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """;

        System.out.println(invitetion);
        System.out.print(choice);
        try {
            var answer = scanner.nextInt();
            System.out.println(choiceAnswer + answer);
            switch (answer) {
                case 1:
                    Greet.greetUser();
                    break;
                case 2:
                    Even.isEven();
                    break;
                case 3:
                    Calc.isCalc();
                    break;
                case 4:
                    Gcd.isGCD();
                    break;
                case 5:
                    Progression.isProgression();
                    break;
                case 6:
                    Prime.isPrime();
                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println(unknownAnswer);
            }
        } catch (InputMismatchException e) {
            System.out.println(unknownAnswer);
        }
    }
}
