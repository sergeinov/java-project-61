package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int getRandomNumber(int minNumber, int maxNumber) {
        // Генерируем случайное число от 1 до 100
        return random.nextInt(maxNumber) + minNumber;
    }
}
