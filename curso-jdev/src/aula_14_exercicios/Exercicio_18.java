package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro qualquer:");
		int num = scan.nextInt();
						
		
		System.out.println("Impar ou par:");
		
		if(num % 2 == 0 ) {
			System.out.println("O n�mero "+num+" � PAR.");
		}else {
			System.out.println("O n�mero "+num+" � IMPAR.");
		}
		
	}

}
