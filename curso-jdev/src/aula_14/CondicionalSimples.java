package aula_14;

import java.util.Scanner;

public class CondicionalSimples {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade = scan.nextInt();			
								
		System.out.println("Condicional simples - caso a proposição seja verdadeira o bloco de comandos é executado:");	
		
		if(idade >=18) {
			System.out.println("O bloco foi executado, pois o valor comparado deu verdadeiro.");
			System.out.println("É maior de idade.");			
		}
		
	}

}
