package com.patika.java101;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbersInArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <= arr.length; i++) {
            System.out.print(i+". element of array: ");
            int element = input.nextInt();
            arr[i-1] = element;
        }

        //Sorts and prints the array
        Arrays.sort(arr);
        System.out.println("Array sorted in ascending order: "+Arrays.toString(arr));

    }
    
}
