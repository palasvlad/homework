package homework;

import java.util.Scanner;

public class ifblocks {

    public static void main(String args[]) {
        assignGradeToScore();
    }

    public static void assignGradeToScore() {
        char Grade = 'Q';
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if (score >= 90) {
            Grade = 'A';
        } else if (score > 80) {
            Grade = 'B';
        } else if (score > 70 && score < 79) {
            Grade='C';
        } else if (score > 60 && score < 69) {
            Grade='D';
        } else if (score<60){
            Grade='F';
        }
        System.out.println("Nota este: "+ Grade);
    }
}
