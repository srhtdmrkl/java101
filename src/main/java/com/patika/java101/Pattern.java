package com.patika.java101;

import java.util.Scanner;

public class Pattern {

    static void decrease(int N, int t) {
        if (t>=0) {
            if (N!=0) {
                System.out.print(N+" ");
                decrease(N-5,t-1);
            }
        }
        System.out.print(N+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int t = N/5;
        decrease(N, t);
    }
}
