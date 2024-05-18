package creationalPatterns.AbstractFactory.fabrica;

import creationalPatterns.AbstractFactory.Coffee;
import creationalPatterns.AbstractFactory.CoffeeFactoryAbstract;
import creationalPatterns.AbstractFactory.coffe.coffeeImpl.CappuccinoImpl;
import creationalPatterns.AbstractFactory.coffe.coffeeImpl.LatteImpl;

public class CappuccinoCoffeeFactory implements CoffeeFactoryAbstract {
    @Override
    public Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("cappuccino")) {
            return new CappuccinoImpl();
        } else {
            throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}
