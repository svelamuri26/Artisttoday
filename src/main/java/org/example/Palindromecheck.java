package org.example;

public class Palindromecheck {
    public static boolean isPalindrome(String s) {

        String str = s.toLowerCase();


        StringBuffer stringBuffer = new StringBuffer(str);

        int left = 0;
        int right = stringBuffer.length() - 1;

        while (left < right) {
            char leftChar = stringBuffer.charAt(left);
            char rightChar = stringBuffer.charAt(right);

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "sai";


        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome(input));

    }
}

