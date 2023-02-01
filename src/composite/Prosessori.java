package composite;

public class Prosessori implements Laiteosa {
	double hinta;
	
	public Prosessori(double hinta) {
		this.hinta = hinta;
	}

	public void lisaaOsa(Laiteosa osa){
		throw new RuntimeException
		("Osan lisääminen laiteosiin ei onnistunut");}

	@Override
	public double getHinta() {
		return this.hinta;
	}

}