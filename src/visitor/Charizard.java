package visitor;

public class Charizard extends PokemonState {
	private static Charizard instance = new Charizard();

	private Charizard() {
	}

	public static Charizard getInstance() {
		return instance;
	}

	void attack() {
		System.out.println("Charizard attacks.");
	};

	void sleep() {
		System.out.println("Charizard is sleeping.");
	};

	void eat() {
		System.out.println("Charizard is eating.");
	};
	
	public void accept(Pokemon pokemon, PokemonVisitor visitor) {
		visitor.visitCharizard(pokemon, this);
	}
}
