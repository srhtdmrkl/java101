package com.patika.java101;

import java.util.Scanner;

public class PalindromeWord {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        input.close();
        
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome word.");
        } else {
            System.out.println(word + " is not a palindrome word.");
        }
    }
}
