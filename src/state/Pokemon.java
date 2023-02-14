package state;

public class Pokemon {
	private PokemonState state;
	private int xp = 0;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}

	public void attack() {
		state.attack();
		xp++;
		if (xp == 5) {
			state = Charmeleon.getInstance();
			System.out.println("Charmander evolved into Charmeleon!");
		} else if (xp == 10) {
			state = Charizard.getInstance();
			System.out.println("Charmeleon evolved into Charizard!");
		}
	};
	
	public void sleep() {
		state.sleep();
	};

	public void eat() {
		state.eat();
	};
	
	protected void changeState(PokemonState s) {
		 state = s;
	  };
}
