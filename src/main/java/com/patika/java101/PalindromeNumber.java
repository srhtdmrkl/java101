package com.patika.java101;

import java.util.Scanner;

public class PalindromeNumber {
    

    static void isPalindrome(int number) {
        int tempNumber = number, reversedNumber = 0, lastDigit;
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            tempNumber /= 10;
        }
        if (number==reversedNumber) {
            System.out.print(number+" is a palindrome number");
        } else {
            System.out.print(number+" is not a palindrome number");
        }
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        isPalindrome(number);
    }  
}