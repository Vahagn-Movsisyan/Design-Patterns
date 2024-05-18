package creationalPatterns.AbstractFactory.fabrica;

import creationalPatterns.AbstractFactory.Coffee;
import creationalPatterns.AbstractFactory.CoffeeFactoryAbstract;
import creationalPatterns.AbstractFactory.coffe.coffeeImpl.LatteImpl;

public class LatteCoffeeFactory implements CoffeeFactoryAbstract {
    @Override
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("latte")) {
            return new LatteImpl();
        } else {
            throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}
