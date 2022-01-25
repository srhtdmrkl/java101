package com.patika.java101;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Flight distance (km): ");
        int flightDistance=input.nextInt();

        //Calculates normal ticket price
        double ticketPrice=flightDistance*0.10;

        System.out.print("Age of Passenger: ");
        int passengerAge=input.nextInt();

        input.close();

        //Applies age discount
        double ticketPriceWithAgeDiscount;
        if (passengerAge<12) {
            ticketPriceWithAgeDiscount=ticketPrice*0.5;
        } else if (passengerAge>65) {
            ticketPriceWithAgeDiscount=ticketPrice*0.7;
        } else if (passengerAge>12 && passengerAge<24) {
            ticketPriceWithAgeDiscount=ticketPrice*0.9;
        } else {
            ticketPriceWithAgeDiscount=ticketPrice;
        }
        
        //Selects ticket type and applies round trip discount
        while(true) {
            System.out.print("1) One way\n2) Round trip\nSelect a ticket type: ");
            int ticketType=input.nextInt();
            switch(ticketType) {
                case 1:
                    System.out.println("Ticket price: $"+ticketPriceWithAgeDiscount);
                    break;
                case 2:
                    double ticketPriceWithTypeDiscount=ticketPriceWithAgeDiscount*0.8*2;
                    System.out.println("Ticket price: $"+ticketPriceWithTypeDiscount);
                    break;
                default:
                    System.out.println("Invalid ticket type.");
                    continue;
            }
            break;
        }
    }
}
