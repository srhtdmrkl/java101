package com.patika.java101;

public class HarmonicAverage {

    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5};
        double harmonicSerie=0.0;
        for (int i = 0; i < numbers.length; i++) {
            double harmonic = numbers[i];
            harmonicSerie += 1/harmonic;
        }
        System.out.println(numbers.length/harmonicSerie);

    }
}