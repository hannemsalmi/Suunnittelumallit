package state;

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

	void sleep(Pokemon p) {
		System.out.println("Charmeleon is sleeping.");
		changeState(p, Charizard.getInstance());
		System.out.println("Charmeleon evolved into Charizard!");
	};

	void eat() {
		System.out.println("Charmeleon is eating.");
	};

}
