package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	List<Laiteosa> osalista = new ArrayList<Laiteosa>();
	double hinta;
	
	public Emolevy (double hinta) {
		this.hinta = hinta;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		osalista.add(osa);
		this.hinta += osa.getHinta();
	}

	@Override
	public double getHinta() {
		return this.hinta;
	}

}
