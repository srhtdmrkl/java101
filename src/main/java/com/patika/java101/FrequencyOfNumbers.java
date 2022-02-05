package com.patika.java101;

public class FrequencyOfNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[arr.length];
        int counted=-1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //Avoids counting the same element again
                    frequency[j]=counted;
                }
            }
            if (frequency[i] != counted) {
                frequency[i] = count;
            }
        }

        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != counted) {
                System.out.println("Frequency of "+arr[i] + " is " + frequency[i]+".");
            }
        }
    }
}
