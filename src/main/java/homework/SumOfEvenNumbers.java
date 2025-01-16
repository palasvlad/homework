package homework;

import java.util.concurrent.ThreadLocalRandom;

public class SumOfEvenNumbers {
    public static void main(String args[]) {
        int arraysize = 4;
        int[] array = randomIntArray(arraysize);
        for(int i=0;i<arraysize;i++){
            System.out.print(array[i]+" ");
        }
        int rezultat = 0;
        for (int i = 0; i < arraysize; i++) {
            if (array[i] % 2 == 0) {
                rezultat += array[i];
            }
        }
        System.out.println("Suma este: " + rezultat);
    }

    public static int[] randomIntArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 300);
        }

        return array;
    }
}
