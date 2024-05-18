package creationalPatterns.AbstractFactory.coffe;

import creationalPatterns.AbstractFactory.Coffee;

public interface Cappuccino extends Coffee {

    void addEspresso();

    void addMilk();

    void addFoam();
}
