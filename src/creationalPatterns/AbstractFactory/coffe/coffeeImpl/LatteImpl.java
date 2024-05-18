package creationalPatterns.AbstractFactory.coffe.coffeeImpl;

import creationalPatterns.AbstractFactory.coffe.Latte;

public class LatteImpl implements Latte {

    @Override
    public void prepare() {
        System.out.println("Preparing Latte coffee...");
        addEspresso();
        addMilk();
        addFoam();
    }

    @Override
    public void addEspresso() {
        System.out.println("Adding espresso...");
    }

    @Override
    public void addMilk() {
        System.out.println("Adding steamed milk...");
    }

    @Override
    public void addFoam() {
        System.out.println("Adding milk foam...");
    }
}
