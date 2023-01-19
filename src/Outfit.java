
public abstract class Outfit {
	
	public abstract String getJeans();
	public abstract String getShirt();
	public abstract String getCap();
	public abstract String getShoes();
	
	@Override
	public String toString() {
		return "Minulla on päälläni " + this.getJeans() + ", "+ this.getShirt() + ", " + this.getCap() + ", " + this.getShoes();
	}

}
