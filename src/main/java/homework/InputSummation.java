package homework;

import java.util.Scanner;

public class InputSummation {
    public static void main(String args[]){
        boolean run= true;
        int sum=0;
        int inputno=0;
        while(run){
            inputno=readNumberfromKeyboar();
            sum+=inputno;
            if (inputno==0){
                run=false;
            }
        }
        System.out.println("Suma este de: "+ sum);
    }

    public static int readNumberfromKeyboar() {
        int number;
        Scanner keyinput = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        number = keyinput.nextInt();
        return number;
    }
}
