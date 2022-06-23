package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro qualquer:");
		int num = scan.nextInt();
		int cont=0;
						
		System.out.println("Números primos:");
		for(int i=1;i<=num;i++) {	
			if((num % i ==0 )) {
				cont++;				
			}			
		}
		
		if((cont<=2) || (num==1)) {			
			System.out.println("O número "+num+" É PRIMO.");
		}else {				
			System.out.println("O número "+num+" Não É PRIMO.");
		}			
		
	}

}
