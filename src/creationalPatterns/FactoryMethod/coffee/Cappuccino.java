package creationalPatterns.FactoryMethod.coffee;

import creationalPatterns.FactoryMethod.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public void dark() {
        System.out.println("It's normal dark");
    }

    @Override
    public void addMilk() {
        System.out.println("It's have a little milk");
    }

    @Override
    public void addSugar() {
        System.out.println("It's actual normal");
    }

    @Override
    public String getCoffeeType() {
        return "Cappuccino ";
    }
}
