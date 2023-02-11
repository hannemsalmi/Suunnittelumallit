package state;

public class Pokemon {
	private PokemonState state;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}

	public void attack() {
		state.attack();
	};
	
	public void sleep() {
		state.sleep(this);
	};

	public void eat() {
		state.eat();
	};
	
	protected void changeState(PokemonState s) {
		 state = s;
	  };
}
