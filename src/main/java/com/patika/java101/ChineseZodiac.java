package com.patika.java101;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthyear = input.nextInt();

        int zodiac = birthyear %12;

        switch(zodiac) {
            case 0:
                System.out.println("Your Chinese zodiac is 'monkey'.");
                break;
            case 1:
                System.out.println("Your Chinese zodiac is 'rooster'.");
                break;
            case 2:
                System.out.println("Your Chinese zodiac is 'dog'.");
                break;
            case 3:
                System.out.println("Your Chinese zodiac is 'pig'.");
                break;
            case 4:
                System.out.println("Your Chinese zodiac is 'rat'.");
                break;
            case 5:
                System.out.println("Your Chinese zodiac is 'ox'.");
                break;
            case 6:
                System.out.println("Your Chinese zodiac is 'tiger'.");
                break;
            case 7:
                System.out.println("Your Chinese zodiac is 'rabbit'.");
                break;
            case 8:
                System.out.println("Your Chinese zodiac is 'dragon'.");
                break;
            case 9:
                System.out.println("Your Chinese zodiac is 'snake'.");
                break;
            case 10:
                System.out.println("Your Chinese zodiac is 'horse'.");
                break;
            case 11:
                System.out.println("Your Chinese zodiac is 'goat'.");
                break;
        }
    }
}