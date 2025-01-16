package homework;

import java.util.Scanner;

public class switchex {
    public static void main (String args[])
    {
        Scanner keyinput = new Scanner(System.in);
        int indexsapt=-1;
        while (indexsapt !=0){
            indexsapt=keyinput.nextInt();
            indexToWeekday(indexsapt);
        }
    }

    public static void indexToWeekday(int index)
    {
        switch(index){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
