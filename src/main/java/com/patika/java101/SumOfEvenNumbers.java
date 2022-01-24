package com.patika.java101;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int k;
        int sum=0;
        int count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        k = input.nextInt();

        for (int i=1; i<=k; i++) {
            if (i % 3 == 0 & i % 4 == 0) {
                count++;
                sum += i;
        }
        input.close();
    }
    System.out.print("Average of the numbers from 1 to "+k+" divisible by 3 and 4  : "+sum/count);
    }
    
}
