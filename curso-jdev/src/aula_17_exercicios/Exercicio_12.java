package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerando uma tabuada de multiplicação:");
		System.out.println("Informe um número inteiro de 1 a 10: ");
		int num = scan.nextInt();
			
		int cont=0;		
			
		System.out.println("Tabuada de "+num);
		
		do {				
			cont++;	
			System.out.println(+num+" x "+cont+"="+cont*num);			
		} while (cont <10);	
		
			
	}

}
