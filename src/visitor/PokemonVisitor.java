package visitor;

public interface PokemonVisitor {
	void visitCharmander(Pokemon pokemon, Charmander charmander);
	void visitCharmeleon (Pokemon pokemon, Charmeleon charmeleon);
	void visitCharizard (Pokemon pokemon, Charizard charizard);

}
