package creationalPatterns.FactoryMethod.coffee;

import creationalPatterns.FactoryMethod.Coffee;

public class Latte implements Coffee {
    @Override
    public void dark() {
        System.out.println("It's little dark");
    }

    @Override
    public void addMilk() {
        System.out.println("It's have a lot milk");
    }

    @Override
    public void addSugar() {
        System.out.println("It's actual freshly");
    }

    @Override
    public String getCoffeeType() {
        return "Latte";
    }
}
