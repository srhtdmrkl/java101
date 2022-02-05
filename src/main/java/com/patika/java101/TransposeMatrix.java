package com.patika.java101;

import java.util.Arrays;

public class TransposeMatrix {   
    
    static int[][] transpose(int[][] arr) {
        int[][] transposedMatrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposedMatrix[j][i] = arr[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        
        int[][] matrixA = {{2, 3, 4}, {5, 6, 7}};
        int[][] matrixB = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("A = "+Arrays.deepToString(matrixA));
        System.out.println("B = "+Arrays.deepToString(matrixB));

        System.out.println("A^T = "+Arrays.deepToString(transpose(matrixA)));
        System.out.println("B^T = "+Arrays.deepToString(transpose(matrixB)));
    }
    
}
