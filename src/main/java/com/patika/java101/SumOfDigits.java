package com.patika.java101;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberEntered = input.nextInt();
        input.close();

        //Calculates the number of digits
        int digitNo=0;
        int number=numberEntered;
        while (number != 0) {
            number /= 10;
            digitNo++;
        }

        //Calculates and sums the value of each digit
        int digitValue;
        int result=0;
        number = numberEntered;
        for (int i = 1; i <= digitNo; i++) {
            digitValue = number % 10;
            result += digitValue;
            number /= 10;
        }
        System.out.println("The sum of the digits of the number "+numberEntered+" is "+result);
    }    
}
