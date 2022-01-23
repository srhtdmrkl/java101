package com.patika.java101;

import java.util.Scanner;

/**
 * Verifies, resets and sets login password.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 *
 */

public class LoginControl 
{
    public static void main( String[] args ) {
        
        String password="java123";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter password : ");
        String enteredPassword = input.nextLine();

        //Verifies the password

        if (enteredPassword.equals(password)) {
            System.out.println("Login successful.");
            System.exit(0);
        } else {
            System.out.println("Password is incorrect.");
        }

        while(true) { 
            System.out.print("Do you want to reset your password? Yes/No ");
            char userChoice = input.next().toLowerCase().charAt(0);
            switch(userChoice) {
                case 'y':
                    
                    //Resets and sets a new password. 

                    while (true) {
                        System.out.println("Enter new password : ");
                        String newPassword = input.next();
                        if (newPassword.equals(password)) {
                            System.out.println("Error!\nYour new password cannot be the same as your old password.");
                            continue;
                        } else {
                            password = newPassword;
                            System.out.println("Your password has been changed successfully.");
                            System.out.println("Your new password is '"+password+"'.");
                            break;
                        }
                    }
                    break;
                case 'n':
                    System.out.println("Logging off.");
                    break;
                default:
                    continue;
            }
            input.close();
            break;
        }
        input.close();
    }
}