package com.patika.java101;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int n = input.nextInt();
        int largeNumber=0, smallNumber=0, i;

        for (i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            int enteredNumber = input.nextInt();

            //Finds the largest number
            if (enteredNumber > largeNumber) {
                largeNumber = enteredNumber;
            }  
            /*Finds the smallest number. Since smallNumber is set to '0' outside the loop, 
            we make sure an entered value is set to smallNumber if it is still '0'.
            Otherwise smallNumber will always be "0".*/
            if (smallNumber == 0) {
                smallNumber = enteredNumber;
            }
            if (enteredNumber < smallNumber) {
                smallNumber = enteredNumber;
            }
        }
        
        System.out.println("The smallest number is "+smallNumber);
        System.out.print("The largest number is "+largeNumber);


    }
    
}
