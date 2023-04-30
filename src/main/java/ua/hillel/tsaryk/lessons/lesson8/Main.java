package ua.hillel.tsaryk.lessons.lesson8;

public class Main {
    public static void main(String[] args) {

        int numberShuttle = 0;

        for (int i = 1; numberShuttle < 100; i++) {

            boolean  control = true;
            int number = i;

                while (number > 0) {

                    int audit = number % 10;

                        if (audit == 4 || audit == 9) {
                             control = false;

                             break;
                             }

                number /= 10;
                }

            if (control) {
                numberShuttle++;
                System.out.println("for shuttle # " + numberShuttle + "  registration number " + i);
            }
        }
    }
}
