package com.patika.java101;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int i, sum=0;
        //Sums the positive divisors, excluding the number itself
        for (i=1; i<n; i++) {
            if (n%i == 0) {
            sum += i;
            }
        }

        //Checks whether the number is perfect or not.
        if (sum==n) {
            System.out.print(n+" is a perfect number.");
        } else {
            System.out.print(n+" is not a perfect number.");
        }
    }
    
}
