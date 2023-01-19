
public class Jasper {
	
    private ClothesAbstractFactory factory;
    private Outfit outfit;

    public Jasper(ClothesAbstractFactory factory) {
        this.factory = factory;
        this.outfit = factory.createOutfit();
    }

    public void showOutfit() {
        System.out.println(outfit.toString());   
}
}