package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Informe o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		int soma = num1+num2;
		
		System.out.println("Os números informados foram: "+num1+" e "+num2);
		System.out.println("O resultado da soma é: "+soma);

	}

}
