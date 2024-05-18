package creationalPatterns.AbstractFactory;

import creationalPatterns.AbstractFactory.fabrica.AmericanCoffeeFactory;
import creationalPatterns.AbstractFactory.fabrica.CappuccinoCoffeeFactory;
import creationalPatterns.AbstractFactory.fabrica.LatteCoffeeFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        CoffeeFactoryAbstract americanoFactory = new AmericanCoffeeFactory();
        CoffeeFactoryAbstract cappuccinoFactory = new CappuccinoCoffeeFactory();
        CoffeeFactoryAbstract latteFactory = new LatteCoffeeFactory();

        Coffee americano = americanoFactory.createCoffee("americano");
        Coffee cappuccino = cappuccinoFactory.createCoffee("cappuccino");
        Coffee latte = latteFactory.createCoffee("latte");

        americano.prepare();
        cappuccino.prepare();
        latte.prepare();
    }
}
