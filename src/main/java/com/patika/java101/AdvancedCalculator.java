package com.patika.java101;

import java.util.*;

public class AdvancedCalculator {
    
    static void addition () {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        
        while(true) {
            System.out.print("Type 0 to exit. Enter the "+i++ + ". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: "+result);
    }

    static void subtraction() {
        Scanner input = new Scanner (System.in);
        int number, result = 0, i = 1;
        
        while(true) {
            System.out.print("Type 0 to exit. Enter the "+i++ +". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
            if (i==2) {
                result = number;
            }
        }
        System.out.println("Result: "+result);
    }

    static void multiplication() {
        Scanner input = new Scanner (System.in);
        int number, result = 1, i = 1;

        while(true) {
            System.out.print("Type 0 to exit. Enter the "+i++ +". number :");
            number = input.nextInt();
            if (number==0) {
                break;
            }
            result *= number;
        }
        System.out.println("Result: "+result);
    }

    static void division() {
        Scanner input = new Scanner (System.in);
        double number, result = 1;
        int i = 1;

        while(true) {
            System.out.print("Type 0 to exit. Enter the "+i++ +". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result /= number;
            if (i==2) {
                result = number;
            }
        }
        System.out.println("Result: "+result);
    }

    static void exponentiation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Base number: ");
        int base = input.nextInt();
        System.out.print("Exponent number: ");
        int exponent = input.nextInt();

        int result = 1;
        for (int i = 1; i<=exponent; i++) {
            result *= base;
        }
        System.out.println("Result: "+result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result=1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: "+result);
    }

    static void modulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int numberA = input.nextInt();
        System.out.print("Enter the modulos: ");
        int numberB = input.nextInt();
        int result=numberA%numberB;
        System.out.println(numberA+" mod "+numberB+" = "+result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Length: ");
        int length = input.nextInt();
        System.out.print("Width: ");
        int width = input.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area :"+area);
        System.out.println("Perimeter :"+perimeter);
    }

    public static void main(String[] args) {
        int select;

        Scanner input = new Scanner(System.in);

        String menu = "1) Addition\n"
        + "2) Subtraction\n"
        + "3) Multiplication\n"
        + "4) Division\n"
        + "5) Exponentiation\n"
        + "6) Factorial\n"
        + "7) Mode\n"
        + "8) Area and Perimeter of Rectangle\n"
        + "0) Exit\n";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (select !=0);
    }
}
