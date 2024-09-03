package prjPokemonV2;

public class PokemonVoador extends Pokemon {
	
	//metodos da subclasse 
	
	public void metodoVoar() {
		System.out.println(this.nome + " está voando! ");
	}
	public void metodoAtaque() {
		System.out.println(this.nome + " está atacando! ");
	}

}
