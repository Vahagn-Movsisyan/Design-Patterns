package creationalPatterns.FactoryMethod.coffee;

import creationalPatterns.FactoryMethod.Coffee;

public class Espress implements Coffee {
    @Override
    public void dark() {
        System.out.println("It's so dark");
    }

    @Override
    public void addMilk() {
        System.out.println("It's don't have a milk");
    }

    @Override
    public void addSugar() {
        System.out.println("It's don't have a normal");
    }

    @Override
    public String getCoffeeType() {
        return "Espresso";
    }
}
