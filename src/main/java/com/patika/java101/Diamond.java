package com.patika.java101;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();


        //Draws upper half of diamond
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        //Draws lower half of diamond
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
