package com.patika.java101;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        double result=0.0;
        for (double i = 1.0; i <=n; i++) {
            result += (1/i);
        }
        System.out.print(n+"th Harmonic Number = "+result);

    }
}
