package decorator;

public class Juusto extends PizzaDecorator {
	protected Pizza taytettavaPizza;
	
	public Juusto (Pizza taytettavaPizza) {
		super(taytettavaPizza);
	}
	
	@Override
	public String getKuvaus() {
		return super.getKuvaus() + ", juusto";
	};
	
	@Override
	public int getHinta() {
		return super.getHinta() + 1;
	};

}
