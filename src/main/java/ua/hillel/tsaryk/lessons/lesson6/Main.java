package ua.hillel.tsaryk.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fragPlayer1Team1 = 0;
        int fragPlayer2Team1 = 0;
        int fragPlayer3Team1 = 0;
        int fragPlayer4Team1 = 0;
        int fragPlayer5Team1 = 0;
        int fragPlayer1Team2 = 0;
        int fragPlayer2Team2 = 0;
        int fragPlayer3Team2 = 0;
        int fragPlayer4Team2 = 0;
        int fragPlayer5Team2 = 0;


        System.out.println("Input name team 1");
        String nameTeam1 = sc.nextLine();


        System.out.println("Input frag player 1 team 1");

             if (sc.hasNextInt()) {
                fragPlayer1Team1 = sc.nextInt();
             } else{
                  System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 2 team 1");

            if (sc.hasNextInt())   {
            fragPlayer2Team1 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 3 team 1");

            if (sc.hasNextInt())   {
            fragPlayer3Team1 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 4 team 1");

            if (sc.hasNextInt())   {
            fragPlayer4Team1 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 5 team 1");

            if (sc.hasNextInt())   {
            fragPlayer5Team1 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        sc.nextLine();



        System.out.println("Input name team 2");
        String nameTeam2 = sc.nextLine();

        System.out.println("Input frag player 1 team 2");

            if (sc.hasNextInt())   {
            fragPlayer1Team1 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 2 team 2");

            if (sc.hasNextInt())   {
            fragPlayer2Team2 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 3 team 2");

            if (sc.hasNextInt())   {
            fragPlayer3Team2 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 4 team 2");

            if (sc.hasNextInt())   {
            fragPlayer4Team2 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }


        System.out.println("Input frag player 5 team 2");

            if (sc.hasNextInt())   {
            fragPlayer5Team2 = sc.nextInt();
            } else{
                System.out.println("Wrong data! Try again!");
            System.exit(0);
        }
        sc.nextLine();

        double numberTeam = 5;
        double meanTeam1 = (fragPlayer1Team1 + fragPlayer2Team1 + fragPlayer3Team1 + fragPlayer4Team1 + fragPlayer5Team1) / numberTeam;
        double meanTeam2 = (fragPlayer1Team2 + fragPlayer2Team2 + fragPlayer3Team2 + fragPlayer4Team2 + fragPlayer5Team2) / numberTeam;
        int sumTeam1 = fragPlayer1Team1 + fragPlayer2Team1 + fragPlayer3Team1 + fragPlayer4Team1 + fragPlayer5Team1;
        int sumTeam2 = fragPlayer1Team2 + fragPlayer2Team2 + fragPlayer3Team2 + fragPlayer4Team2 + fragPlayer5Team2;

        if (meanTeam1 > meanTeam2) {

           System.out.println("Team Winner " + nameTeam1 + "  Team scores " + sumTeam1  + "  Mean scores " + meanTeam1);

       } else if (meanTeam1 < meanTeam2) {

           System.out.println("Team Winner " + nameTeam2  + "  Team scores " + sumTeam2  + "  Mean scores " + meanTeam2);

        } else {
           System.out.println("Dead head. Team 1, 2 scores " + sumTeam2 + "  Mean cores team's " + meanTeam2);
       }


    }
    }
