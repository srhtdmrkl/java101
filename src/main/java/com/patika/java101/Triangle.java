package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the hypotenuse and the area of a right triangle.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */
public class Triangle 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of Adjacent Leg: ");
        double adjacentLeg = input.nextDouble();
        System.out.println("Length of Opposite Leg: ");
        double oppositeLeg = input.nextDouble();
        input.close();
        // Calculates the hypotenuse of right triangle.
        double hypotenuse = Math.sqrt(adjacentLeg * adjacentLeg + oppositeLeg * oppositeLeg);
        System.out.println("Length of Hypotenuse: "+hypotenuse);
        // Calculates the area of right triangle.
        double triangleArea = adjacentLeg * oppositeLeg / 2;
        System.out.println("Area of Right Triangle: "+triangleArea);
    }
}