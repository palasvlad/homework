package homework;

import org.junit.Test;

import java.util.Scanner;

public class BasicArithmeticOperators {

    public static void main(String[] args) {
        checkifnumberisodd();
    }

    @Test
    public void SumDiffMultiplyDiv() {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        System.out.println("Adunare: " + c);
        System.out.println("Scadere: " + d);
        System.out.println("Scadere: " + e);
        System.out.println("Scadere: " + f);
    }

    @Test
    public void compoundassignement() {
        int a = 5;
        int b = 7;
        int c = 2;

        System.out.println("a = " + a + " b= " + b + " c=" + c);
        c += a;
        System.out.println("c+=a " + "c=" + c + " a=" + a);
        System.out.println("a = " + a + " b= " + b + " c=" + c);
        c -= a;
        System.out.println("c-= a" + "c=" + c + " a=" + a);
        c *= a;
        System.out.println("c*= a" + "c=" + c + " a=" + a);
        c /= a;
        System.out.println("c/=a " + "c=" + c + " a=" + a);
    }

    public static void checkifnumberisodd() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti un numar de la tastatura: ");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Numarul introdus este par");
        } else {
            System.out.println("Numarul este impar");
        }


    }
}
