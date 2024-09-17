package pjrExercicio02;

public class livro {

	//atributos
	private String titulo;
	private String autor;
	private int paginas;
	private double preco;
	
	 // Construtores 
	 public livro() {
		 
	 }
	 public livro(String titulo,String autor,int paginas,double preco) {
		 this.titulo = titulo;
		 this.autor = autor;
		 this.paginas = paginas;
		 this.preco = preco;
		 
		 //getters and setters
	 }
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	 
}
