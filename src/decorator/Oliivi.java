package decorator;

public class Oliivi extends PizzaDecorator {
	protected Pizza taytettavaPizza;
	
	public Oliivi (Pizza taytettavaPizza) {
		super(taytettavaPizza);
	}
	
	@Override
	public String getKuvaus() {
		return super.getKuvaus() + ", oliivi";
	};
	
	@Override
	public int getHinta() {
		return super.getHinta() + 1;
	};
	
}
