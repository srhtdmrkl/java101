package com.patika.java101;

import java.util.Scanner;

public class FibonacciRecursive {

    // F(n) = F(n-1) + F(n-2)
    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        System.out.print(number+". number in the Fibonacci sequence is "+fib(number));
    }


    
}
