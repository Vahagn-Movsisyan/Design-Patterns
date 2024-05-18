package creationalPatterns.FactoryMethod;

import creationalPatterns.FactoryMethod.coffee.Cappuccino;
import creationalPatterns.FactoryMethod.coffee.Espress;
import creationalPatterns.FactoryMethod.coffee.Latte;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type) {
            case "espresso" -> new Espress();
            case "latte" -> new Latte();
            case "cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}
