package visitor;

public class Main {
	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		BonusVisitor visitor = new BonusVisitor();

		pokemon.accept(visitor);
		System.out.println("Pokemonin bonuspisteet yhteensä " + pokemon.getBonusPoints());

		for (int i = 0; i < 5; i++) {
			pokemon.attack();
		}

		pokemon.accept(visitor);
		System.out.println("Pokemonin bonuspisteet yhteensä " + pokemon.getBonusPoints());

		for (int i = 0; i < 5; i++) {
			pokemon.attack();
		}

		pokemon.accept(visitor);
		System.out.println("Pokemonin bonuspisteet yhteensä " + pokemon.getBonusPoints());

	}
}
