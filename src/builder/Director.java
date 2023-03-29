package builder;

public class Director {

    private BurgerBuilder burgerBuilder;

    public Director(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void makeBurger() {
        burgerBuilder.addCheese();
        burgerBuilder.addBurgerpatty();
        burgerBuilder.addLettuce();
    }
}
