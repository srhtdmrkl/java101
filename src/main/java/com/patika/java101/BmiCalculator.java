package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the Body Mass Index (BMI).
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */

public class BmiCalculator 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Height (cm): ");
        double height = input.nextDouble()/100;
        input.close();
        double bmi = weight / (height * height);
        System.out.println( "BMI : "+bmi );
    }
}