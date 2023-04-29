package ua.hillel.tsaryk.lessons.lesson8;

public class Main {
    public static void main(String[] args) {
        int shuttle = 1;
        int i = 0;


        while (i = 100) {
            i++;

            if (shuttle == 4 || shuttle == 9) {
                shuttle++;
                continue;
            } else if (shuttle / 10 == 4 || shuttle / 10 == 9) {
                shuttle++;
                continue;
            } else if (shuttle % 10 == 4 || shuttle % 10 == 9) {
                shuttle++;
                continue;
            } else if ((shuttle - 100) / 10 == 4 || (shuttle - 100) / 10 == 9) {
                shuttle++;
                continue;
            } else if ((shuttle - 100) % 10 == 4 || (shuttle - 100) % 10 == 9) {
                shuttle++;
                continue;
            } else {
                System.out.println("Shutle # " + i + "number " + shuttle);
                shuttle++;

            }

        }


    }
}

