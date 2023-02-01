package composite;

public class Main {
	public static void main(String[] args) {
		
	
		Laiteosa emolevy = new Emolevy(67.99);
		
		Laiteosa muistipiiri = new Muistipiiri(38.11);
		emolevy.lisaaOsa(muistipiiri);
		
		Laiteosa naytonohjain = new Naytonohjain(139.00);
		emolevy.lisaaOsa(naytonohjain);
		
		Laiteosa prosessori = new Prosessori(399.99);
		emolevy.lisaaOsa(prosessori);
		
		Laiteosa verkkokortti = new Verkkokortti(58.95);
		emolevy.lisaaOsa(verkkokortti);
		
		Laiteosa kotelo = new Kotelo(96.99);
		kotelo.lisaaOsa(emolevy);
		
		double kokonaishinta = Math.round(kotelo.getHinta() * 100.0) / 100.0;
		
		System.out.println(kokonaishinta);
		
		
	}

}
