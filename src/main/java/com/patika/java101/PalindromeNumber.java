package com.patika.java101;

import java.util.Scanner;

public class PalindromeNumber {
    

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number==reverseNumber) {
            return true;
        } else
            return false;
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        System.out.println(isPalindrome(number));
    }
        
}