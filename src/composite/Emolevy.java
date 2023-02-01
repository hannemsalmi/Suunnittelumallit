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
	}

	@Override
	public double getHinta() {
		for(Laiteosa l : osalista) {
			this.hinta += l.getHinta();
		}
		return this.hinta;
	}

}
