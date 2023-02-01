package singleton;

public class BossFactory implements VaateFactory{
	private static BossFactory INSTANCE = new BossFactory();
	private int paitoja_luotu = 0;
	
	private BossFactory() {}
	
	public static BossFactory getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Paita luoPaita() {
		this.paitoja_luotu++;
		return new Bosspaita();
	}
	
	
	public int getLuodutPaidat() {
		return this.paitoja_luotu;
	}
}
