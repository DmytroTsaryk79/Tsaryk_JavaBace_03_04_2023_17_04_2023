package ua.hillel.tsaryk.lessons.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int game = (int) (Math.random() * 10);
        int gamer;
        int i = 1;

        System.out.println("Guess the number from 1 to 10. You have three try");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Try " + i);
            i++;

            if (sc.hasNextInt()) {
                gamer = sc.nextInt();

                if (gamer == game) {
                    System.out.println("Congratulations! You won! Number " + gamer);
                    break;

                } else {
                    System.out.println("Did not guess");
                }

            } else {
                System.out.println("Wrong data! Try again!");

            }
            sc.nextLine();

        } while ( i < 4 );
        System.out.println("Number " + game);

        }



        }
