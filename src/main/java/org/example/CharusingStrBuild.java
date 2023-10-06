package org.example;
import java.util.Scanner;


public class CharusingStrBuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        char character = getCharacterAtIndex(str, index);

        if (character != '\0') {
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public static char getCharacterAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            StringBuilder stringBuilder = new StringBuilder(str);
            return stringBuilder.charAt(index);
        } else {
            return '\0';
        }
    }
}