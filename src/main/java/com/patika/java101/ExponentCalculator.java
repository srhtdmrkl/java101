package com.patika.java101;

import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();
        input.close();

        //Calculates the exponent
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.print(base+" to the power of "+exponent+" :"+result);
    }
    
}
