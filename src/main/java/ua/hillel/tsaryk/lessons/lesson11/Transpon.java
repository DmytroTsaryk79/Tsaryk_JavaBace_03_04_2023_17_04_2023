package ua.hillel.tsaryk.lessons.lesson11;

import java.util.Scanner;

    public class Transpon {
    public static void main(String[] args) {


        int m=0;
        int n=0;

        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter number of lines");

        if (sc.hasNextInt()) {
            m = sc.nextInt();
        } else {
           System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

        System.out.println("Enter number of columns");

        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Wrong data! Try again!");
            System.exit(0);
        }

           int [][] array = new int[n][m];
           int[][] array2 = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("AFTER");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
