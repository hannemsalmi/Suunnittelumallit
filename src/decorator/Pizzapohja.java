package decorator;

public class Pizzapohja implements Pizza {
	String kuvaus = "Pizzapohja, tomaattikastike";
	int hinta = 8;

	@Override
	public String getKuvaus() {
		return kuvaus;
	}

	@Override
	public int getHinta() {
		return hinta;
	}


}
