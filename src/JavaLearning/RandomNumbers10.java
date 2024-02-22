package JavaLearning;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        int maxNumber = randomNumbers[0];
        for (int j = 1; j < 10; j++) {
            if (randomNumbers[j] > maxNumber) {
                maxNumber = randomNumbers[j];
            }
        }
        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers
        ));
        System.out.println("Maximum number: " + maxNumber);
    }
}

