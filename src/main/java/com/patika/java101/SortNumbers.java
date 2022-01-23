package com.patika.java101;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("1st Number: ");
        int a = input.nextInt();
        System.out.print("2nd Number: ");
        int b = input.nextInt();
        System.out.print("3rd Number: ");
        int c = input.nextInt();
        input.close();

        //Sorts and prints the numbers
        if (a>b && a>c) {
            if (b>c) {
                System.out.println(a+" > "+b+" > "+c);
            } else {
                System.out.println(a+" > "+c+" > "+b);
            }
        } else if (b>a && b>c) {
            if (a>c) {
                System.out.println(b+" > "+a+" > "+c);
            } else {
                System.out.println(b+" > "+c+" > "+a);
            }
        } else if (c>a && c>b) {
            if (a>b) {
                System.out.println(c+" > "+a+" > "+b);
            } else {
                System.out.println(c+" > "+b+" > "+a);
            }
        }
    }
    
}