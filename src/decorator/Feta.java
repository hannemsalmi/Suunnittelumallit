package decorator;

public class Feta extends PizzaDecorator {
	protected Pizza taytettavaPizza;
	
	public Feta (Pizza taytettavaPizza) {
		super(taytettavaPizza);
	}
	
	@Override
	public String getKuvaus() {
		return super.getKuvaus() + ", feta";
	};
	
	@Override
	public int getHinta() {
		return super.getHinta() + 2;
	};

}