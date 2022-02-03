package com.patika.java101;

public class LetterB {
<<<<<<< HEAD

    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3 ) {
=======
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                    letter[i][3] = "   ";
                } else if (j == 0 || j == 3) {
>>>>>>> 440f3b34efa993db42fdd165ac185af720309495
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

<<<<<<< HEAD
        for (String[] row : letter) {
            for (String col : row) {
=======
        for (String[] row : letter){
            for (String col : row){
>>>>>>> 440f3b34efa993db42fdd165ac185af720309495
                System.out.print(col);
            }
            System.out.println();
        }
    }
    
}
