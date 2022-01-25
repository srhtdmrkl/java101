package com.patika.java101;

import java.util.Scanner;

/**
 * Determines the zodiac sign from month and day.
 * 
 * patika.dev Java101 Homework
 * 
 * @author Serhat Demirkol
 */

public class ZodiacSign {
   public static void main(String[] args) {
      String month;
      int day;
      String sign="";
      boolean isError = false;
      boolean monthError = false;

      Scanner input = new Scanner(System.in);
      System.out.print("Which month were you born? ");
      month = input.nextLine().toLowerCase();
      System.out.print("Which day of month were you born? ");
      day = input.nextInt();
      input.close();

      if (month.equals("january")) {
         if (day>21 && day<32) {
            sign="Aquaris";
         } else if (day>0 && day<32) {
            sign="Capricorn";
         } else {
            isError=true;
         }
      }

      if (month.equals("february")) {
         if (day>21 && day<30) {
            sign="Pisces";
         } else if (day>0 && day<30) {
            sign="Aquaris";
         } else {
            isError=true;
         }
      }

      if (month.equals("march")) {
         if (day>21 && day<32) {
            sign="Aries";
         } else if (day>0 && day<32) {
            sign="Pisces";
         } else {
            isError=true;
         }
      }

      if (month.equals("april")) {
         if (day>21 && day<31) {
            sign="Taurus";
         } else if (day>0 && day<31) {
            sign="Aries";
         } else {
            isError=true;
         }
      }

      if (month.equals("may")) {
         if (day>21 && day<32) {
            sign="Gemini";
         } else if (day>0 && day<32) {
            sign="Taurus";
         } else {
            isError=true;
         }
      }

      if (month.equals("june")) {
         if (day>21 && day<31) {
            sign="Cancer";
         } else if (day>0 && day<31) {
            sign="Gemini";
         } else {
            isError=true;
         }
      }

      if (month.equals("july")) {
         if (day>21 && day<32) {
            sign="Leo";
         } else if (day>0 && day<32) {
            sign="Cancer";
         } else {
            isError=true;
         }
      }

      if (month.equals("august")) {
         if (day>21 && day<32) {
            sign="Virgo";
         } else if (day>0 && day<32) {
            sign="Leo";
         } else {
            isError=true;
         }
      }

      if (month.equals("september")) {
         if (day>21 && day<31) {
            sign="Libra";
         } else if (day>0 && day<31) {
            sign="Virgo";
         } else {
            isError=true;
         }
      }

      if (month.equals("october")) {
         if (day>21 && day<32) {
            sign="Scorpio";
         } else if (day>0 && day<32) {
            sign="Libra";
         } else {
            isError=true;
         }
      }

      if (month.equals("november")) {
         if (day>21 && day<31) {
            sign="Sagittarius";
         } else if (day>0 && day<31) {
            sign="Scorpio";
         } else {
            isError=true;
         }
      }

      if (month.equals("december")) {
         if (day>21 && day<32) {
            sign="Capricorn";
         } else if (day>0 && day<32) {
            sign="Sagittarius";
         } else {
            isError=true;
         }
      } else {
         monthError=true;
      }

      if (isError) {
         System.out.println(month+" "+day+" is an invalid date.");
      } else if (monthError) {
         System.out.print(month+" is an invalid month. Try typing the month. i.e. January");
      } else {
         System.out.print("Your zodiac sign is "+sign+".");
      }
    }
}