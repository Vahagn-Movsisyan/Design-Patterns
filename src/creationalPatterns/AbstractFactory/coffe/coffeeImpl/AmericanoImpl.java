package creationalPatterns.AbstractFactory.coffe.coffeeImpl;

import creationalPatterns.AbstractFactory.coffe.Americano;

public class AmericanoImpl implements Americano {

    @Override
    public void prepare() {
        System.out.println("Preparing Americano coffee...");
        addEspresso();
        addWater();
    }

    @Override
    public void addEspresso() {
        System.out.println("Adding espresso...");
    }

    @Override
    public void addWater() {
        System.out.println("Adding hot water...");
    }
}
