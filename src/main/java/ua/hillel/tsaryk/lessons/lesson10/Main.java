package ua.hillel.tsaryk.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int number = 7;

        int[] lotteryOrg = new int[number];

        int[] lotteryGam = new int[number];

        for (int i = 0; i < lotteryOrg.length; i++) {
            lotteryOrg[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < lotteryGam.length; i++) {
            lotteryGam[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < lotteryOrg.length - 1; i++) {
            for (int j = 0; j < lotteryOrg.length - 1 - i; j++) {
               if (lotteryOrg[j] > lotteryOrg[j + 1]) {
                    int temp = lotteryOrg[j];
                   lotteryOrg[j] = lotteryOrg[j + 1];
                    lotteryOrg[j + 1] = temp;
               }
           }
       }
        for (int i = 0; i < lotteryGam.length - 1; i++) {
            for (int j = 0; j < lotteryGam.length - 1 - i; j++) {
                if (lotteryGam[j] > lotteryGam[j + 1]) {
                    int temp = lotteryGam[j];
                    lotteryGam[j] = lotteryGam[j + 1];
                    lotteryGam[j + 1] = temp;
                }
            }
        }

        int coincided =0;
        for (int i = 0; i < lotteryOrg.length - 1; i++) {
            if (lotteryOrg[i] == lotteryGam[i]) {
                coincided++;
            }
        }
        System.out.println(Arrays.toString(lotteryOrg));
        System.out.println(Arrays.toString(lotteryGam));
        System.out.println("number coincided = " + coincided);

    }
}
