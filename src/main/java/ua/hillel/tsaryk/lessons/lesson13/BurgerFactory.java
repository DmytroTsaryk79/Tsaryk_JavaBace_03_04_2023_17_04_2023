package ua.hillel.tsaryk.lessons.lesson13;

public class BurgerFactory {
    public static void main(String[] args) {

        Burger full = new Burger("Звичайний бургер", "булочку", "котлета для бургера", "сир", "зелень", "майонез");
        Burger withoutMayo = new Burger("Дієтичний бургер", "булочку", "котлета для бургера", "сир", "зелень");
        Burger doubleMeat = new Burger("Бургер з подвійним м'ясом","булочку", 2,"котлети для бургера", "сир", "зелень", "майонез");
    }
}
