package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the total price of groceries.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */
public class Grocery 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight of pear (kg) : ");
        double pearKg = input.nextDouble();
        System.out.print("Weight of apple (kg) : ");
        double appleKg = input.nextDouble();
        System.out.print("Weight of tomato (kg) : ");
        double tomatoKg = input.nextDouble();
        System.out.print("Weight of banana (kg) : ");
        double bananaKg = input.nextDouble();
        System.out.print("Weight of eggplant (kg) : ");
        double eggplantKg = input.nextDouble();
        input.close();

        //Calculates the total price
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
        double totalPrice = pearPrice*pearKg+applePrice*appleKg+tomatoPrice*tomatoKg+bananaPrice*bananaKg+eggplantPrice*eggplantKg;

        System.out.println( "Total Price : "+totalPrice);
    }
}