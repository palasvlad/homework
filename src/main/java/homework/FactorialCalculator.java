package homework;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String args[]) {
        int factorial = readNumberfromKeyboar();
        int result = calculateFactorial(factorial);

        System.out.println("Factorial pentru " + factorial + "este:" + result);
    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }

    public static int calculateFactorial(int factorial) {
        int result = 0;
        int resultpartial = (factorial * (factorial - 1));
        int resultintermeridiar = 0;
        for (int i = factorial - 2; i > 0; i--) {
            result = resultpartial * i;
            resultpartial = result;
            resultintermeridiar += result;
        }
        return result;
    }
}
