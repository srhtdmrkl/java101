package com.patika.java101;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int number;
        int total=0;
        Scanner input = new Scanner(System.in);

        //Adds the numbers that are multiples of 4 until an odd number is entered 
        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 != 1);
        input.close();
        System.out.print("Sum of the numbers multiples of 4  : "+total);
    }
    
}
