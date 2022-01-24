package com.patika.java101;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeap = false;
        input.close();

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 != 0 & year % 4 ==0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.print(year+" is a leap year.");
        } else {
            System.out.print(year+" is not a leap year.");
        }
    }
}
