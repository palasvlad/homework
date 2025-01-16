package homework;

import java.util.Scanner;

public class simpleCalculator {


    public static void main(String args[]) {
        int firstnumber;
        int secondnumber;
        String operator;
        boolean keepGoing = true;
        Scanner keyboardinput = new Scanner(System.in);

        while (keepGoing) {
            System.out.println("PrimulNumar:");
            firstnumber = keyboardinput.nextInt();
            System.out.println("AlDoileaNumar:");
            secondnumber = keyboardinput.nextInt();
            System.out.println("Operator:");
            operator = keyboardinput.next();

            switch (operator){
                case "+":
                    System.out.println("Adunare: "+ (firstnumber+secondnumber));
                    break;
                case "-":
                    System.out.println("Scadere: "+ (firstnumber-secondnumber));
                    break;
                case "stop":
                    keepGoing=false;
                    break;

            }
        }

    }


}
