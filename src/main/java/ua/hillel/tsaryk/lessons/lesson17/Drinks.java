package ua.hillel.tsaryk.lessons.lesson17;

public class Drinks {
    public static final double COFFEE_PRICE = 2.5;
    public static final double TEA_PRICE = 1.5;
    public static final double LEMONADE_PRICE = 2.0;
    public static final double MOJITO_PRICE = 3.0;
    public static final double MINERAL_WATER_PRICE = 1.0;
    public static final double COCA_COLA_PRICE = 1.5;
    public static int totalDrinks = 0;
    public static double totalPrice = 0;

    public static void makeCoffee() {
        System.out.println("Готовим кофе...");
        System.out.println("Кофе готов!");
        totalDrinks++;
        totalPrice += COFFEE_PRICE;
    }
    public static void makeTea() {
        System.out.println("Готовим чай...");
        System.out.println("Чай готов!");
        totalDrinks++;
        totalPrice += TEA_PRICE;
    }
    public static void makeLemonade() {
        System.out.println("Готовим лимонад...");
        System.out.println("Лимонад готов!");
        totalDrinks++;
        totalPrice += LEMONADE_PRICE;
    }
    public static void makeMojito() {
        System.out.println("Готовим мохито...");
        System.out.println("Мохито готов!");
        totalDrinks++;
        totalPrice += MOJITO_PRICE;
    }
    public static void makeMineralWater() {
        System.out.println("Готовим минеральную воду...");
        System.out.println("Минеральная вода готова!");
        totalDrinks++;
        totalPrice += MINERAL_WATER_PRICE;
    }
    public static void makeCocaCola() {
        System.out.println("Готовим кока-колу...");
        System.out.println("Кока-кола готова!");
        totalDrinks++;
        totalPrice += COCA_COLA_PRICE;
    }
}
