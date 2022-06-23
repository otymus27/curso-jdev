package aula_14;

import java.util.Scanner;

public class CondicionalComposta {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade = scan.nextInt();			
								
		System.out.println("Condicional composta - o bloco de comandos é executado independente do resultado:");	
		
		if(idade >=18) {
			System.out.println("O bloco foi executado, pois o valor comparado deu verdadeiro.");
			System.out.println("É maior de idade.");			
		}else {
			System.out.println("O bloco foi executado, pois o valor comparado deu falso.");
			System.out.println("É menor de idade.");
		}
		
	}

}
