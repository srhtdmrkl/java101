package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the VAT inclusive price and VAT amount based on the price.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 */

public class VatCalculator 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        double price=input.nextDouble();
        //Chooses the Vat rate based on the price.
        double vatRate = (price>1000)?0.08:0.18;
        double vatAmount = price * vatRate;
        double vatIncludedPrice = price + vatAmount;
        System.out.println("VAT rate is "+vatRate);
        System.out.println("VAT Amount: "+vatAmount);
        System.out.println("VAT Inclusive Price: "+vatIncludedPrice);
        input.close();
        }
}