package homework;

import java.util.Scanner;

public class CountdownTimer {
    public static void main(String args[]) throws InterruptedException {
     int counterValue=readNumberfromKeyboar();
     timer(counterValue);

    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }

    public static void timer(int seconds) throws InterruptedException {
        for (int i=seconds; i>=0; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
