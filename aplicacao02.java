package prjCaneta;

public class aplicacao02 {
	
	public static void main(String[] args) {
		Livro livro01 = new Livro("Alice no Pais","Julio trigueiro");
		Livro livro02 = new Livro("Quarto de Despejo","Pedro Francisco");
		
		System.out.println("Livros disponiveis");
		System.out.print("01. ");
		livro01.status();
		System.out.print("02. ");
		livro02.status();
		
		System.out.println("Qual livro deseja alugar?");
		int escolha = sc.nextInt();
		
		
		
	}

}
