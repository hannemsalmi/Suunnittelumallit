package builder;

public class McDonaldsBuilder implements BurgerBuilder {

    private McDonaldsBurger burger;

    public McDonaldsBuilder() {
        this.burger = new McDonaldsBurger();
    }

    public void addCheese() {
        burger.setCheese("mc donald's cheese");
    }

    public void addBurgerpatty() {
        burger.setBurgerpatty("mc donald's burgerpatty");
    }

    public void addLettuce() {
        burger.setLettuce("mc donald's lettuce");
    }

    public McDonaldsBurger getBurger() {
        return burger;
    }
}