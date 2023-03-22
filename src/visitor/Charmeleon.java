package visitor;

public class Charmeleon extends PokemonState {
	private static Charmeleon instance = new Charmeleon();

	private Charmeleon() {
	}

	public static Charmeleon getInstance() {
		return instance;
	}

	void attack() {
		System.out.println("Charmeleon attacks.");
	};

	void sleep() {
		System.out.println("Charmeleon is sleeping.");
	};

	void eat() {
		System.out.println("Charmeleon is eating.");
	};

	public void accept(Pokemon pokemon, PokemonVisitor visitor) {
		visitor.visitCharmeleon(pokemon, this);
	}
}
