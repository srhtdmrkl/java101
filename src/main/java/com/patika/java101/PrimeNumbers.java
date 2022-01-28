package com.patika.java101;

public class PrimeNumbers {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int primeNumber = 0;

        for (i = 1; i <= 100; i++) {
            int counter=0;
            for (j = i; j>=1; j--) {
                // Counts the number of dividors
                if (i%j==0) {
                    counter = counter + 1;
                }
            }
            //Checks if the number has two dividors (1 and itself)
            if (counter ==2) {
                primeNumber = i;
                System.out.print(primeNumber+" ");
            }
        }
    }

    
}
