package creationalPatterns.FactoryMethod;

public class FactoryMain {
    public static void main(String[] args) {
        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        espresso.dark();
        espresso.addSugar();

        Coffee latte = CoffeeFactory.createCoffee("latte");
        latte.dark();
        latte.addMilk();
        latte.addSugar();

        Coffee cappuccino = CoffeeFactory.createCoffee("cappuccino");
        cappuccino.dark();
        cappuccino.addMilk();
        cappuccino.addSugar();
    }
}
