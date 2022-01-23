package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the taxi fare based on distance. Minimum fare is $20.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */
public class Taximeter 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Distance (km): ");
        double distance=input.nextDouble();
        input.close();

        double initialCharge=10.00;
        double rate=2.20;
        double totalCharge=initialCharge+distance*rate;
        double taxiFare=(totalCharge<20)?20:totalCharge;
        System.out.println("Taxi fare: $"+taxiFare);

    }
}