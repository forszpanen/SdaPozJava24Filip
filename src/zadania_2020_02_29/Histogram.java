package zadania_2020_02_29;

import java.util.Arrays;
import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        int[] randomNumbers = new int[100];
        int[] count = new int[21];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(21) + 10;
            System.out.print(randomNumbers[i] + ", ");
            count[randomNumbers[i] - 10]++;
        }
        System.out.println();
        for (int i = 0; i < count.length; i++) {
            System.out.println((i + 10) + ":" + "*".repeat(count[i]) + "(" + count[i] + ")");
        }
    }
 
}
