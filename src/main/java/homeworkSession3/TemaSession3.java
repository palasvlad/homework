package homeworkSession3;

import java.util.*;

public class TemaSession3 {

    public static void main(String[] args) {
        boolean continueApp = true;
        int indexsapt;
        while (continueApp) {
            System.out.println("Select the funtion to demo:");
            System.out.println("Press 1: break, continue,return");
            System.out.println("Press 2: create int string double arrays and print them ");
            System.out.println("Press 3: You have 5 tries to guess the random number between 1 and 100");
            System.out.println("Press 4: Build and print a string array");
            System.out.println("Press 5: Build and print a double array");
            System.out.println("Press 6: to quit.");
            Scanner keyinput = new Scanner(System.in);
            indexsapt = keyinput.nextInt();
            switch (indexsapt) {
                case 1:
                    System.out.println("Demo for Break");
                    breakWord();
                    break;
                case 2:
                    System.out.println("Demo for continue");
                    List<Integer> test = new ArrayList<>(readIntList());
                    filterNumbersContinueDemo(test);
                    break;
                case 3:
                    System.out.println("Demo for return");
                    returnDemo();
                case 4:
                    System.out.println("Build and print a string array");
                    buildPrintStringArray();
                case 5:
                    System.out.println("Build and pring a double array");
                    buildPrintDoubleArray();
                case 6:
                    System.out.println("Exited");
                    continueApp = false;
            }
        }
    }

    public static void breakWord() {
        System.out.println("break when you type break");
        Scanner keyinput = new Scanner(System.in);
        while (true) {
            String bscrword = keyinput.nextLine();
            System.out.println(bscrword);
            if (bscrword.contains("break")) {
                System.out.println("breaking");
                break;
                //-------------------------------------------------------------------use of break
            }
        }
    }

    public static void filterNumbersContinueDemo(List<Integer> listToFilter) {
        for (int number : listToFilter) {
            //-------------------------------------------------------------------------------use of a for each
            if ((number % 2 == 0) && (number >= 10)) {
                continue;
                //---------------------------------------------------------------------------use of continue
            }
            System.out.println(number);
        }

    }

    public static void returnDemo() {
        int numberOfTries = 5;
        Random random = new Random();
        Scanner nextInt = new Scanner(System.in);
        int randomnumber = random.nextInt(10);
        //-------------------------------------------------------------use of a classic for
        for (int i = 0; i <= numberOfTries; i++) {
            System.out.println("Introdu un numar:");
            if (nextInt.nextInt() == randomnumber) {
                System.out.println("Ai ghicit");
                return;
                //-------------------------------------------------------- use of return
            } else {
                System.out.println("Mai ai " + (4 - i) + " incercari.");
            }

        }

    }

    public static List<Integer> readIntList() {
        //----------------------------------------------------------array list of int
        List<Integer> intList = new ArrayList<>();
        Scanner nextNumber = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Write numbers:");
            if (nextNumber.hasNextInt()) {
                intList.add(nextNumber.nextInt());
            } else {
                stop = true;
            }
        }
        return intList;
    }

    public static void buildPrintStringArray() {
        List<String> demoListString = new ArrayList<>();
        int sizeOfList;
        Scanner intscanner = new Scanner(System.in);
        System.out.println("Size of list to be:");
        sizeOfList = intscanner.nextInt();
        intscanner.reset();
        for (int i = 0; i < sizeOfList+1; i++) {
            System.out.println("Add element to string list:");
            demoListString.add(intscanner.nextLine());
        }
        //workaround a issue
        demoListString.removeFirst();
        System.out.println("we'll now pring the list");
        System.out.println(demoListString);
        // e putin buguita functia asta dar merge

    }

    public static void buildPrintDoubleArray() {
        List<Double> demoDoubleList = new ArrayList<>();
        Scanner intscanner = new Scanner(System.in);
        System.out.println("Size of list to be:");
        int sizeOfList = intscanner.nextInt();

        for (int i = 0; i < sizeOfList; i++) {
            System.out.println("Add double elements to list");
            demoDoubleList.add(intscanner.nextDouble());
        }

        System.out.println("The list with doubles is:" + demoDoubleList);

    }
}
