package homework;

import java.util.Scanner;

public class firstPositiveDivisor {

    public static void main(String args[]){
        int number=readNumberfromKeyboar();
        firstDivizor(number);

    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput= new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number=keyinput.nextInt();
        return number;
    }

    public static void firstDivizor(int number)
    {
        int divizor;
        for (divizor=2;divizor<=number;divizor++){
            if (number%divizor==0){
                System.out.println("Gasit divizor:"+ divizor);
                break;
            }
        }
    }

}
