package homework;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]) {
        int inputNumber = readNumberfromKeyboar();
        for (int i = 1; i < 11; i++) {
            System.out.println(inputNumber + " x " + i + " = " + inputNumber * i);
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
