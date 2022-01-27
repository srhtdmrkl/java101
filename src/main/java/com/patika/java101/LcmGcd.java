package com.patika.java101;

import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        //Finds the large and small numbers 
        int largeNumber = Math.max(a,b);
        int smallNumber = Math.min(a,b);
        int i = smallNumber;

        //Finds the greatest common divisor (gcd)
        while (largeNumber%i!=0 || smallNumber%i!=0) {
            i = i - 1;
        }
        int gcd = i;

        //Calculates the lowest common multiple
        int lcm = (a*b)/gcd;
        
        System.out.println("lcm("+a+","+b+") = "+lcm);
        System.out.print("gcd("+a+","+b+") = "+gcd);

        input.close();
    }
    
}
