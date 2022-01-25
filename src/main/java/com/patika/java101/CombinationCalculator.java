package com.patika.java101;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total number of objects in the set: ");
        int n = input.nextInt();
        System.out.print("Number of choosing objects from the set: ");
        int r = input.nextInt();
        input.close();

        //Calculates the factorial of n;
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        //Calculates the factorial of r;
        int rFactorial = 1;
        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        //Calculates the factorial of (n-r)
        int nMinusR = n - r;
        int nMinusRFactorial = 1;
        for (int i = 1; i <= nMinusR; i++) {
            nMinusRFactorial *= i;
        }

        //Calculates and prints C(n,r) 
        int result = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.print("C("+n+","+r+") = "+result);
        
    }
    
}
