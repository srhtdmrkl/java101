package com.patika.java101;

import java.util.Scanner;

/**
 * Calculates the average percentage grade based on the marks entered by the user.
 * Uses the ?: Operator to decide whether the user is passed or failed based on a passing average grade of 60.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 */

 
public class AverageGradeCalculator {
    public static void main(String[] args) {
       
        //User enters the percentage marks. Only marks between 0 and 100 are accepted.
        Scanner input = new Scanner(System.in);
        int math, econ, csci, acct, mis;
        while(true) {
            System.out.print("Your 'Applied Calculus' Grade: ");
            math = input.nextInt();
            if(math>100 || math<0) {
                continue;
            } else {
                break;
            }
        }
        while(true) {
            System.out.print("Your 'Macroeconomics' Grade: ");
            econ = input.nextInt();
            if(econ>100 || econ<0) {
                continue;
            } else {
                break;
            }
        }
        while(true) {
            System.out.print("Your 'Computer Science' Grade: ");
            csci = input.nextInt();
            if(csci>100 || csci<0) {
                continue;
            } else {
                break;
            }
        }
        while(true) {
            System.out.print("Your 'Accounting' Grade: ");
            acct = input.nextInt();
            if(acct>100 || acct<0) {
                continue;
            } else {
                break;
            }
        }
        while(true) {
            System.out.print("Your Managing Systems and Technolog' Grade: ");
            mis = input.nextInt();
            if(mis>100 || mis<0) {
                continue;
            } else {
                break;
            }
        }
        input.close();

        //Calculates the average percentage grade and decides whether passed or failed.

        double averagepercentagegrade = (math+econ+csci+acct+mis)/5;

        //Decides whether passed or not.

        String userPassed = "passed.";
        String userFailed = "failed.";
        String result = (averagepercentagegrade>=55) ? userPassed : userFailed;
        System.out.println("You "+result+". Your average percentage grade is "+averagepercentagegrade+".");
    }

}