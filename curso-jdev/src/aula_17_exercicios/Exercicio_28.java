package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro qualquer:");
		int num = scan.nextInt();
		int cont=0;
						
		System.out.println("N�meros primos:");
		for(int i=1;i<=num;i++) {	
			if((num % i ==0 )) {
				cont++;				
			}			
		}
		
		if((cont<=2) || (num==1)) {			
			System.out.println("O n�mero "+num+" � PRIMO.");
		}else {				
			System.out.println("O n�mero "+num+" N�o � PRIMO.");
		}			
		
	}

}
