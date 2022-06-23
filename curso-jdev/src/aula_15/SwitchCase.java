package aula_15;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Estação do ano:");
		System.out.println("1 - Verão, 2 - Primavera, 3 - Inverno, 4 - Outono");
		System.out.println("Informe um número como opção:");
		int estacao = scan.nextInt();			
								
		System.out.println("Estrutura Switch Case - encadeamento de vários blocos de comandos e são executados independente do resultado:");	
		System.out.println("Estações do ano:");
		switch (estacao) {		
			case 1: 			
				System.out.println("Você está no verão.");
				break;
			case 2:
				System.out.println("Você está na primavera.");
				break;
			case 3:
				System.out.println("Você está no inverno.");
				break;
			case 4:
				System.out.println("Você está no outono.");	
				break;			
			default:			
				System.out.println("Estação inválida!!!.");	
				break;			
		}
		
	}

}
