package homework;

import java.util.Scanner;

public class trafficlight {

    public static void main(String args[]){
        String color;
        Scanner keyin = new Scanner(System.in);
        color = keyin.nextLine();
        switch(color){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Prepare to go:");
                break;
            case"green":
                System.out.println("Gogogog");
                break;
        }
    }
}
