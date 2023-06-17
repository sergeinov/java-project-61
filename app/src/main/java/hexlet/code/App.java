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
        final Scanner scanner = new Scanner(System.in);
        final String choiceGame = """
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """;

        final String greet = "1";
        final String even = "2";
        final String calc = "3";
        final String gcd = "4";
        final String prog = "5";
        final String prime = "6";
        final String exit = "0";

        System.out.print(choiceGame);
        try {
            String answer = scanner.next();
            System.out.println("Your choice: " + answer);
            switch (answer) {
                case greet -> Greet.greetUser();
                case even -> Even.isEven();
                case calc -> Calc.isCalc();
                case gcd -> Gcd.isGCD();
                case prog -> Progression.isProgression();
                case prime -> Prime.isPrime();
                case exit -> System.out.println("Good bye!");
                default -> System.out.println("Unknown game");
            }
        } catch (InputMismatchException e) {
            System.out.println("Unknown game");
        }
    }
}
