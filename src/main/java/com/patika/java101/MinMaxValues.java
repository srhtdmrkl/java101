package com.patika.java101;

import java.util.Scanner;

public class MinMaxValues {

    public static void main(String[] args) {
        
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int min=list[0], max=list[0];

        //Finds minimum and maximum numbers
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        //Calculates the maximum range between numbers
        int range = max - min;
        int rangeToMin = range;
        int rangeToMax = range;

        for (int i : list) {
            //Calculates the closest smaller number to the number entered by user
            if (i < number) {
                if (number - i < rangeToMin ) {
                    rangeToMin = number - i;
                    min = i;
                }
            }
            
            //Calculates the closest larger number to the number entered by user
            if (i > number) {
                if (i - number < rangeToMax) {
                    rangeToMax = i - number;
                    max = i;
                }
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    
}