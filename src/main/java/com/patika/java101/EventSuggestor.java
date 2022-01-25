package com.patika.java101;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class EventSuggestor 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature: ");
        double temperature = input.nextDouble();
        input.close();
        
        if (temperature<5) {
            System.out.println("Skiing");
        } else if (temperature>=5 && temperature<15) {
            System.out.println("Cinema");
        } else if (temperature>=15 && temperature<25) {
            System.out.println("Picnic");
        } else {
            System.out.println("Swimming");
        }
    }
}
