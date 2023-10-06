package org.example;


public class PalindromeCheckNum {

    public static boolean isPalindrome(int x) {

        String original = String.valueOf(x);


        StringBuffer reversed = new StringBuffer(original).reverse();


        return original.equals(reversed.toString());
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 10;

        System.out.println(num1 + " is a palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is a palindrome: " + isPalindrome(num2));

    }
}
