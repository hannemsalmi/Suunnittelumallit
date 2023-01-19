
public class BossFactory implements ClothesAbstractFactory {
	
	@Override
	public Outfit createOutfit() {
		return new BossOutfit();
	}

}