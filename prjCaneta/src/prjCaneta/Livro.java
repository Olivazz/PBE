package prjCaneta;

public class Livro {
	
	String nomeLivro, autorLivro;
	boolean aluguel;
	
	public Livro (String livro, String autor) {
		this.nomeLivro = livro;
		this.autorLivro = autor;
		this.aluguel = false;
	}
	
	void status() {
		System.out.println(this.nomeLivro + ": " + (this.aluguel ? "Alugado":"disponivel"));
		
	}
	
	void.alugar() {
		
	}
	

	
}

	