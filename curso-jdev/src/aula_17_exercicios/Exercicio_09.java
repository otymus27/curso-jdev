package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro para a quantidade que deseja: ");
		int num = scan.nextInt();
		
		int cont=1;
			
		System.out.println("N�meros pares entre 1 e "+num);
		
		do {				
			cont++;		
			
			if(cont%2==0 ) {
				System.out.print(+cont+" ");	
			}			
			
		} while (cont <num);	
	
	}

}
