package visitor;

abstract class PokemonState {
	  void attack() {};
	  void sleep() {};
	  void eat() {};
	  void changeState(Pokemon p, PokemonState s) {
		  p.changeState(s);
	  };
	  void accept(Pokemon pokemon, PokemonVisitor visitor) {};
}
