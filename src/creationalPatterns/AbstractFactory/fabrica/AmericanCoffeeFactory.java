package creationalPatterns.AbstractFactory.fabrica;

import creationalPatterns.AbstractFactory.Coffee;
import creationalPatterns.AbstractFactory.CoffeeFactoryAbstract;
import creationalPatterns.AbstractFactory.coffe.coffeeImpl.AmericanoImpl;

public class AmericanCoffeeFactory implements CoffeeFactoryAbstract {
    @Override
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("americano")) {
            return new AmericanoImpl();
        } else {
            throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}
