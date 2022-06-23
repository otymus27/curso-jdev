package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça 2 números inteiros e um número real.
			Calcule e mostre:
			a. o produto do dobro do primeiro com metade do segundo .
			b. a soma do triplo do primeiro com o terceiro.
			c. o terceiro elevado ao cubo.
		 * 
		 * 
		 * 
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro nº inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o valor do segundo nº inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o valor do terceiro nº, agora pode ser real:");
		double num3 = scan.nextDouble();
											
		double calculo1 = (2*num1)*(num2/2);
		double calculo2 = (3*num1)+(num3);
		double calculo3 = Math.pow(num3, 3);
		
		System.out.println("Cálculos - v1");
		System.out.println("Primeiro nº informado: "+num1);
		System.out.println("Segundo nº informado: "+num2);
		System.out.println("Terceiro nº informado: "+num3);
		System.out.println("o produto do dobro do primeiro com metade do segundo: "+calculo1);
		System.out.println("a soma do triplo do primeiro com o terceiro: "+calculo2);
		System.out.println("o terceiro elevado ao cubo: "+calculo3);	
		
	}

}
