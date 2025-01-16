package homework;

import java.nio.file.FileSystemNotFoundException;

public class CountVowels {
    public static void main(String args[]) {

        String exercise = "Count Vowels: Create a program that counts the number of vowels in a given string. Use a for-each loop to iterate through the characters of the string. Consider A, E, I, O, U as vowels for this exercise.";
        int vowels = 0;
        for (char chr : exercise.toCharArray()) {
            if (chr == 'A' || chr == 'a' || chr == 'E' || chr == 'e' || chr == 'I' || chr == 'i' || chr == 'O' || chr == 'o' || chr == 'U' || chr == 'u') {
                vowels += 1;
                System.out.println("Found vowel:" + chr + " pana acum avem " + vowels + "vocale.");
            }
        }
        System.out.println("Avem " + vowels + " vocale.");

    }
}
