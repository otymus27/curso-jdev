package aula_14;

import java.util.Scanner;

public class CondicionalAninhada {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade = scan.nextInt();			
								
		System.out.println("Condicional aninhada - encadeamento de v�rios blocos de comandos e s�o executados independente do resultado:");	
		
		if(idade >=18 && idade <65) {
			System.out.println("Maior de idade - voto obrigat�rio!!!");		
		}else if(idade >=16 && idade <18) {
			System.out.println("Adolescente - voto facultativo!!!");		
		}else if(idade >=65) {
			System.out.println("Idoso - voto facultativo!!!");		
		}else {
			System.out.println("De menor - n�o pode votar!!!");
		}
		
	}

}
