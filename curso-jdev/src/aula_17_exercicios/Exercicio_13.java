package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando qualquer pot�ncia:");
		System.out.println("Informe a base: ");
		int base = scan.nextInt();
		
		System.out.println("Informe o expoente: ");
		int expoente= scan.nextInt();
		
		int cont=0;
		int resultado=1;
			
		System.out.println("Pot�ncia de "+base+" elevado a "+expoente);
		
		do {				
			cont++;	
			System.out.println(+resultado+"x"+base);	
			resultado *= base;
		} while (cont <expoente);	
		
		System.out.println();
		System.out.println("A pot�ncia de "+base+" elevado a "+expoente+" �: "+resultado);
		
			
	}

}
