package singleton;

public class AdidasFactory implements VaateFactory{
	private static AdidasFactory INSTANCE = new AdidasFactory();
	private int paitoja_luotu = 0;
	
	private AdidasFactory() {}
	
	public static AdidasFactory getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Paita luoPaita() {
		this.paitoja_luotu++;
		return new Adidaspaita();
	}
	
	
	public int getLuodutPaidat() {
		return this.paitoja_luotu;
	}
}
