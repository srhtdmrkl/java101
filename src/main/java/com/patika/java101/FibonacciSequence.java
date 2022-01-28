package com.patika.java101;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        //Formula of Fibonacci is Fn = F(n-1) + F(n-2)
        int n1=0;
        int n2=1;
        int n3;
        
        // Prints first two numbers
        System.out.print(n1+" "+n2);

        // Starts from third number and calculates Fn
        for (int i = 2; i < n; i++) {
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
