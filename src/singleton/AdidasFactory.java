package singleton;

public class AdidasFactory implements VaateFactory{
	private static AdidasFactory INSTANCE = new AdidasFactory();
	
	private AdidasFactory() {}
	
	public static AdidasFactory getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Paita createPaita() {
		return new Adidaspaita();
	}
}
