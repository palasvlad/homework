package homework;

public class leapYearChecker {

    public static void main(String args[]) {
        for (int year = 2024; year < 2050; year++) {
            leapYearChk(year);
        }
    }

    public static void leapYearChk(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Leap year:" + year);
        }
    }

}
