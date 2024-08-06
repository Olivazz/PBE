package novoProjeto;

import java.util.Scanner;

public class DiaSemanaif{

	public static void Main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num = sc.nextInt();
		
		String dia;
		
		if (num == 1) {
			dia ="domingo";
		}
		else if (num == 2) {
			dia ="segunda";
		}
		else if (num == 3) {
			dia ="terça";
		}
		else if (num == 4) {
			dia ="quarta";
		}
		else if (num == 5) {
			dia ="quinta";
		}
		else if (num == 6) {
			dia ="sexta";
		}
		else if (num == 7) {
			dia ="sábado";
		}
		else {
			dia = "invalido";
		}
		System.out.println("O dia de hoje é: " + dia );
		
		sc.close();
	
		
	}

}
