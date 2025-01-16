package homework;

import java.util.Scanner;

public class GuessttheNumberGame {

    public static void main(String args[]) {
        int noToGuess = randomNoGenerator();
        int maxAttempts = 5;
        for (int i = 1; i <= maxAttempts; i++) {
            int userGuess;
            System.out.println("Introdu numarul: ");
            userGuess = readNumberfromKeyboar();
            if (userGuess == noToGuess) {
                System.out.println("Ai castigat!");
                break;
            }

        }
        System.out.println("Ai Pierdut, varianta castigatoare era: " + noToGuess);

    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }

    public static int randomNoGenerator() {
        int number;
        number = (int) (Math.random() * 11);
        return number;
    }
}
