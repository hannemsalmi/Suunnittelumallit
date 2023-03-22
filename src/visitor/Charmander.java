package visitor;

public class Charmander extends PokemonState {
	private static Charmander instance = new Charmander();

	private Charmander() {
	}

	public static Charmander getInstance() {
		return instance;
	}

	void attack() {
		System.out.println("Charmander attacks.");
	};

	void sleep() {
		System.out.println("Charmander is sleeping.");
	};

	void eat() {
		System.out.println("Charmander is eating.");
	};
	
	
	void accept(Pokemon pokemon, PokemonVisitor visitor) {
		visitor.visitCharmander(pokemon, this);
	}
}
