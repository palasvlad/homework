package homework;

import java.util.Scanner;

public class passwordchecker {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        passwordChecker(password);
        
    }

    public static void passwordChecker(String password) {
        if (password.length()<8){
            System.out.println("Weak Password");
        } else if (password.matches(".*\\d.*")) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Moderate password");
        }

    }

}
