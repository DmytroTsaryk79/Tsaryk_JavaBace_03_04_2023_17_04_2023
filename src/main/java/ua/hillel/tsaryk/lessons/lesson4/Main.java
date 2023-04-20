package ua.hillel.tsaryk.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;

        int warriorMin = 9;
        int bowmanMin = 35;
        int riderMin = 12;

        int numberWarLi = 860;
        double numberWarMin = numberWarLi * 1.5;

        int powerWarLi = warriorLi * numberWarLi;
        int powerBowLi = bowmanLi * numberWarLi;
        int powerRiderLi = riderLi * numberWarLi;

        double powerWarMin = warriorMin * numberWarMin;
        double powerBowMin = bowmanMin * numberWarMin;
        double powerRiderMin = riderMin * numberWarMin;

        int powerArmyLi = powerWarLi + powerBowLi + powerRiderLi;
        double powerArmyMin = powerWarMin + powerBowMin + powerRiderMin;

        System.out.println("power Army Li =" + powerArmyLi);
        System.out.println("power Army Min =" + powerArmyMin);
    }
}
