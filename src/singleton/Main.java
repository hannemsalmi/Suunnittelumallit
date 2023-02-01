package singleton;

public class Main {
	public static void main(String[] args) {
	VaateFactory adidastehdas = AdidasFactory.getInstance();
	VaateFactory bosstehdas = BossFactory.getInstance();
	
	Paita adidaspaita = adidastehdas.luoPaita();
	System.out.println("Luotiin " + adidaspaita.getNimi());
	Paita adidaspaita2 = adidastehdas.luoPaita();
	System.out.println("Luotiin " + adidaspaita2.getNimi());
	Paita bosspaita = bosstehdas.luoPaita();
	System.out.println("Luotiin " + bosspaita.getNimi());
	
	System.out.println("Adidas-tehdas on tuottanut " + adidastehdas.getLuodutPaidat() + " paitaa.");
	System.out.println("Boss-tehdas on tuottanut " + bosstehdas.getLuodutPaidat() + " paitaa.");
	}
}
