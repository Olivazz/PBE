package novoProjeto;

import java.util.Scanner;

public class DiaSemanaSc {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num = sc.nextInt();		
		
		String dia;
		
		switch (num) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "Valor Invalido";
			break;
			
		}

		System.out.println("O dia de hoje é: " + dia );
		sc.close();
	}

}
