package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num;
		int cont=1;
		int maior=0;
				
		System.out.println("Lendo N números informados e comparando:");
		do {
			System.out.println("Informe um número inteiro qualquer:");
			num=scan.nextInt();			
			if(num > maior) {
				maior=num;
			}					
			cont++;			
		} while (cont <=5);		
		
		System.out.println();		
		System.out.println("O maior número é: "+maior);	
	
	}

}
