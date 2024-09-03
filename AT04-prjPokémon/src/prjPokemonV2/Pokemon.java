package prjPokemonV2;

public class Pokemon {
	//Atributos
	
	private String nome;
	private String tipo;
	private int nivel;
	private int hp;
	private int defesa;
	
	//construtores
	
	public Pokemon() {
		
	}
	
	public Pokemon(String Nomes, String Tipos, int Niveis, int Hps, int Defesas) {
		this.nome = Nomes;
		this.tipo = Tipos;
		this.nivel = Niveis;
		this.hp = Hps;
		this.defesa = Defesas;
	}
	
	//metodos setters
	
		public void setNome (String nomes) {
			this.nome = nomes;
		}
	

}
