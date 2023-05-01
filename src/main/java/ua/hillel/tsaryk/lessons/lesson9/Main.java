package ua.hillel.tsaryk.lessons.lesson9;

import java.util.Arrays;

public class Main {

            public static void main(String[] args) {


            int numberPlayers = 25;
            int minAge = 18;
            int maxAge = 40;

            int[] arrayTeam1 = new int[numberPlayers];
            int[] arrayTeam2 = new int[numberPlayers];
            double sum1 = 0;
            double sum2 = 0;

            for (int i = 0; i < arrayTeam1.length; i++) {
                arrayTeam1[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
               sum1 = sum1 + arrayTeam1[i];
            }
               double arithmeticMean1 = sum1 / numberPlayers;
                System.out.println(Arrays.toString(arrayTeam1));
                System.out.println("arithmetic mean age players team 1  " + arithmeticMean1);

            for (int i = 0; i < arrayTeam2.length; i++) {
                arrayTeam2[i] = (int) ((Math.random() * (maxAge - minAge + 1)) + minAge);
                sum2 = sum2 + arrayTeam2[i];
            }
                double arithmeticMean2 = sum2 / numberPlayers;
                System.out.println(Arrays.toString(arrayTeam2));
                System.out.println("arithmetic mean age players team 2  " + arithmeticMean2);


        }
    }

