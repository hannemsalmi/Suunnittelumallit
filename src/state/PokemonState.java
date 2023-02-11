package state;

abstract class PokemonState {
	  void attack() {};
	  void sleep(Pokemon p) {};
	  void eat() {};
	  void changeState(Pokemon p, PokemonState s) {
		  p.changeState(s);
	  };
}
