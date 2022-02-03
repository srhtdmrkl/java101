package com.patika.java101;

public class DuplicatedOddNumbers {

    static boolean isFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value ) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 2, 33, 9, 10};
        int[] duplicatedEvenNumbers = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i]%2 == 0)) {
                    if (!isFound(duplicatedEvenNumbers, list[i])) {
                        duplicatedEvenNumbers[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicatedEvenNumbers) {
            if (value != 0) {
                System.out.print(value+" ");
            }
        }        
    }
    
}
