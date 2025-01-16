package homework;

import java.util.concurrent.ThreadLocalRandom;

import static java.util.stream.IntStream.range;

public class FindTheMaximum {

    public static void main(String args[]) {
        int[] array = buildRandomArray();
        int maximum = 0;
        for (int num : array) {
            if (num > maximum) {
                maximum = num;
            }

            System.out.print(num + " ");
        }

        System.out.println(" ");
        System.out.println("Maximul este:" + maximum);

    }

    public static int[] buildRandomArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 30000);
        }
        return array;
    }
}
