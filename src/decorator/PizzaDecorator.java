package decorator;

public class PizzaDecorator implements Pizza {
	protected Pizza taytettavaPizza;
	
	public PizzaDecorator (Pizza taytettavaPizza) {
		this.taytettavaPizza = taytettavaPizza;
	}

	public String getKuvaus() {
		return taytettavaPizza.getKuvaus();
	}

	public int getHinta() {
		return taytettavaPizza.getHinta();
	}

}
