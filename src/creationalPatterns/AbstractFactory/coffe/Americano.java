package creationalPatterns.AbstractFactory.coffe;

import creationalPatterns.AbstractFactory.Coffee;

public interface Americano extends Coffee {
    void addEspresso();

    void addWater();
}

