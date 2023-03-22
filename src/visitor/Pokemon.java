package visitor;

public class Pokemon {
	private PokemonState state;
	private int xp;
	protected int bonuspoints;
	
	public Pokemon() {
		state = Charmander.getInstance();
		this.xp = 0;
		this.bonuspoints = 0;
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
	  
	public void accept(PokemonVisitor visitor) {
    state.accept(this, visitor);
}
	  
    public void addBonusPoints(int points) {
        bonuspoints += points;
    }

    public int getBonusPoints() {
        return bonuspoints;
    }
}
