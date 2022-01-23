package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the area and the perimeter of a circle.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */

public class CircleArea 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Radius of the circle : ");
        double radius = input.nextDouble();

        input.close();
        double pi = 3.14;
        double area = pi*radius*radius;
        double perimeter = pi*radius*2;
        
        System.out.println("Are of the circle: "+area);
        System.out.println("Perimeter of the circle: "+perimeter);
    }
}
