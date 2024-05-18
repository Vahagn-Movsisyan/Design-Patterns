package creationalPatterns.AbstractFactory.coffe;

import creationalPatterns.AbstractFactory.Coffee;

public interface Latte extends Coffee {
    void addEspresso();

    void addMilk();

    void addFoam();
}
