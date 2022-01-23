package com.patika.java101;

import java.util.Scanner;

/**
 * Simple calculator which can operate on two numbers using four operators.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */
public class SimpleCalculator 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("First number : ");
        double n1 = input.nextDouble();
        System.out.print("Second number : ");
        double n2 = input.nextDouble();
        
        while(true) {
            System.out.print("1) Addition\n2) Subraction\n3) Multiplication\n4) Division\nSelect an operator : ");
            int operator = input.nextInt();

            switch (operator) {
                case 1:
                    System.out.println(n1 + n2);
                    break;
                case 2:
                    System.out.println(n1 - n2);
                    break;
                case 3:
                    System.out.println(n1 * n2);
                    break;
                case 4:
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("Invalid operator selected.");
                    continue;
            }
            break;
        }
        input.close();
    }
}