package homework;

public class palindrome {
    public static void main(String args[]) {

        String exercise = "level";
        StringBuilder wordsbackwards = new StringBuilder();
        int i = (exercise.length() - 1);
        while (i >= 0) {
            wordsbackwards.append(exercise.charAt(i));
            i--;
        }
        if (exercise.equals(wordsbackwards.toString())) {
            System.out.println("Given string is a palindrome.");
        } else {
            System.out.println(wordsbackwards + " -> Not palindrome");
        }
    }
}
