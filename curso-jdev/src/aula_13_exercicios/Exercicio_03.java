package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		
		int soma = num1+num2;
		
		System.out.println("Os n�meros informados foram: "+num1+" e "+num2);
		System.out.println("O resultado da soma �: "+soma);

	}

}
