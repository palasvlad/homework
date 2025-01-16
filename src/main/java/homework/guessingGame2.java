package homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class guessingGame2 {

    public static void main(String args[]) {
        int randomnumber = ThreadLocalRandom.current().nextInt(0,100);
        boolean guessed = false;
        while (!guessed) {
            int guess=readNumberfromKeyboar();
            if(guess==randomnumber){
                guessed=true;
            } else if (guess<randomnumber) {
                System.out.println("TooLow");
            }
            else {
                System.out.println("TooHigh");
            }

        }
    }
    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }
}
