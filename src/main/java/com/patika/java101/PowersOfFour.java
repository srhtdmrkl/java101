package com.patika.java101;

import java.util.Scanner;

public class PowersOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();

        //Prints powers of 4
        for (int i = 4; i <= number; i*=4) {
            System.out.println(i);
        }

        //Prints powers of 5
        for (int i = 5; i <= number; i*=5) {
            System.out.println(i);
        }
    }
}
