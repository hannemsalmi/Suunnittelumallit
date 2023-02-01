package composite;

public class Muistipiiri implements Laiteosa {
	double hinta;
	
	public Muistipiiri(double hinta) {
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
