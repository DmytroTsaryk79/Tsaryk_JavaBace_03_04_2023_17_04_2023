package ua.hillel.tsaryk.lessons.lesson14;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vladimir",
                25, "March", 1976,
                "v_klichko@yahoo.com", 485273659,
                "Klichko", 109.0, "125/75", 18000);
        User user2 = new User("Vitaliy", 19,
                "july", 1971, "klichkovitaliy@gmail.com",
                380997778, "Klichko", 112, "130/80", 24546);
        User user3 = new User("Mike", 30, "june",
                1966, "mtyson@hotmail.com", 140877755,
                "Tyson", 98.4, "135/75", 11200);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user3.setStepsTaken(9850);
        user2.setWeight(107.4);
        user3.printAccountInfo();
        user2.printAccountInfo();



    }
}
