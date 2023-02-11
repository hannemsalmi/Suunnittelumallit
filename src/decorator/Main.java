package decorator;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Pizza> menu = new ArrayList<Pizza>();
		Pizza pizza1 = new Juusto(new Feta(new Oliivi(new Pizzapohja())));
		Pizza pizza2 = new Feta(new Oliivi(new Pizzapohja()));
		Pizza pizza3 = new Juusto(new Oliivi(new Pizzapohja()));
		
		menu.add(pizza1);
		menu.add(pizza2);
		menu.add(pizza3);
		
		for (Pizza pizza : menu) {
            System.out.println(pizza.getKuvaus() + ", hinta: " + pizza.getHinta() + " e");
        }
	}
}
