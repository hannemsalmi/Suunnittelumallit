package visitor;

public class BonusVisitor implements PokemonVisitor {

	@Override
	public void visitCharmander(Pokemon pokemon, Charmander charmander) {
		pokemon.addBonusPoints(1);
		System.out.println("Pokemon sai 1 bonuspisteen!");
	}


	@Override
	public void visitCharmeleon(Pokemon pokemon, Charmeleon charmeleon) {
		pokemon.addBonusPoints(2);
		System.out.println("Pokemon sai 2 bonuspistettä!");
	}

	@Override
	public void visitCharizard(Pokemon pokemon, Charizard charizard) {
		pokemon.addBonusPoints(3);
		System.out.println("Pokemon sai 3 bonuspistettä!");
	}
}
