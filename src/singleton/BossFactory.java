public class BossFactory implements VaateFactory{
	private static BossFactory INSTANCE = new BossFactory();
	
	private BossFactory() {}
	
	public static BossFactory getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Paita createPaita() {
		return new Adidaspaita();
	}
}
