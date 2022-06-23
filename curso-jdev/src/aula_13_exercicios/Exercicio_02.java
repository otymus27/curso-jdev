package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int num = scan.nextInt();
		
		System.out.println("O número informado foi: "+num);

	}

}
