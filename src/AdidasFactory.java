
public class AdidasFactory implements ClothesAbstractFactory {
	
	@Override
	public Outfit createOutfit() {
		return new AdidasOutfit();
	}

}
