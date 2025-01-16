package homework;

import java.util.Scanner;

public class SkipNegativeNumbers {
    public static void main(String args[]) {
        sumUntil0();

    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }

    public static boolean isNumberPositive(int number) {
        boolean isPositive;
        if (number > 0) {
            isPositive = true;
        } else {
            isPositive = false;
        }
        return isPositive;
    }

    public static void sumUntil0() {
        int number = -1;
        int sum = 0;
        while (number != 0) {
            number = readNumberfromKeyboar();
            if (number<0) {
                continue;
            }
            sum += number;
        }
        System.out.println("Sum is: " + sum);
    }
}
