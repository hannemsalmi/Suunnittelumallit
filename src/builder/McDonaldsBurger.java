package builder;

public class McDonaldsBurger {
    private StringBuilder burgerParts = new StringBuilder();

    public void setCheese(String cheese) {
        burgerParts.append("Cheese: " + cheese + "\n");
    }

    public void setBurgerpatty(String burgerpatty) {
        burgerParts.append("Burgerpatty: " + burgerpatty + "\n");
    }

    public void setLettuce(String lettuce) {
        burgerParts.append("Lettuce: " + lettuce + "\n");
    }

    public String toString() {
        return "McDonald's burger:\n" + burgerParts.toString();
    }
}
