package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerando um intervalo de números inteiros:");
		System.out.println("Informe o primeiro número: ");
		int num = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2= scan.nextInt();
		
		int cont=num-1;
			
		System.out.println("Intervalo de "+num+" - "+num2);
		
		do {				
			cont++;	
			System.out.print(+cont+" ");			
		} while (cont <num2);	
			
	}

}
