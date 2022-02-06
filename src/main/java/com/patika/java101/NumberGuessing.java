package com.patika.java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.print("Guess the number: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("Remaining chance(s) : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("You're gonna lost a chance next time.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congrats! The number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Wrong guess!");
                if (selected > number) {
                    System.out.println(selected + " is bigger than the number.");
                } else {
                    System.out.println(selected + " is smaller than the number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining chance(s): " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }

    }
}
