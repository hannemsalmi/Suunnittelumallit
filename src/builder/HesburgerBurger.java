package builder;

import java.util.ArrayList;

public class HesburgerBurger {
    private ArrayList<String> burgerParts = new ArrayList<String>();

    public void setCheese(Cheese cheese) {
        burgerParts.add("Cheese: " + cheese.getName());
    }

    public void setBurgerpatty(Burgerpatty burgerpatty) {
        burgerParts.add("Burgerpatty: " + burgerpatty.getName());
    }

    public void setLettuce(Lettuce lettuce) {
        burgerParts.add("Lettuce: " + lettuce.getName());
    }

    public String toString() {
        String burgerString = "Hesburger burger:\n";
        for (String part : burgerParts) {
            burgerString += part + "\n";
        }
        return burgerString;
    }
}