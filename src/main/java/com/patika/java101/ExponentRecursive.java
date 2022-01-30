package com.patika.java101;

import java.util.Scanner;

public class ExponentRecursive {

    static double exponent(double base, double power) {
        if (power == 0) {
            return 1;
        } if (power < 0) {
            power = -power;
            return 1/(base * exponent(base, power-1));
        }
        else {
            return base * exponent(base, power-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int power = input.nextInt();
        input.close();
        System.out.print(exponent(base,power));
    }
}
