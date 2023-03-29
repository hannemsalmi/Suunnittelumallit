package builder;

import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {

    private HesburgerBurger burger;

    public HesburgerBuilder() {
        this.burger = new HesburgerBurger();
    }

    public void addCheese() {
        burger.setCheese(new Cheese("hesburger cheese"));
    }

    public void addBurgerpatty() {
        burger.setBurgerpatty(new Burgerpatty("hesburger burgerpatty"));
    }

    public void addLettuce() {
        burger.setLettuce(new Lettuce("hesburger lettuce"));
    }

    public HesburgerBurger getBurger() {
        return burger;
    }
}