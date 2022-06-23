package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando qualquer fatorial:");
		System.out.println("Informe o fatorial: ");
		int fatorial = scan.nextInt();
						
		int cont=0;
		int resultado=fatorial;
			
		System.out.print("Fatorial de "+fatorial+"!="+fatorial+".");
		
		do {				
			cont++;					
			System.out.print(fatorial-cont+".");
			resultado = resultado * (fatorial-cont);
			
		} while (cont <fatorial-1);	
		
		System.out.println();
		System.out.println("O resultado do fatorial de "+fatorial+" é igual a: "+resultado);
			
	}

}
