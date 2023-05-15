package ua.hillel.tsaryk.lessons.lesson13;

public class Burger {

    String roll;
    String type;
    String meat;
    String cheese;
    String vegetables;
    String sauce;
    int number;

    public Burger(String type, String roll, String meat, String cheese, String vegetables, String sauce){
        this.type = type;
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sauce = sauce;

        System.out.println(type + " містить: " + roll + ", "  + meat + ", " + cheese + ", " + vegetables + ", " + sauce);
    }

    public Burger(String type, String roll,String meat, String cheese, String vegetables){
        this.type = type;
        this.roll = roll;

        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;

        System.out.println(type + " містить: " + roll + ", "  + meat + ", " + cheese + ", " + vegetables);
    }
    public Burger(String type, String roll, int number, String meat, String cheese, String vegetables, String sauce){
        this.type = type;
        this.roll = roll;
        this.number = number;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sauce = sauce;

        System.out.println(type + " містить: " + roll +", " + number + " " + meat + ", " + cheese + ", " + vegetables + ", " + sauce);
    }

}
