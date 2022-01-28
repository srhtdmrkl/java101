package com.patika.java101;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*(n-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
