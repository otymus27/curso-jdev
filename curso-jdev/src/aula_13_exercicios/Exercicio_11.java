package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
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
		
		System.out.println("Informe o valor do primeiro n� inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o valor do segundo n� inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o valor do terceiro n�, agora pode ser real:");
		double num3 = scan.nextDouble();
											
		double calculo1 = (2*num1)*(num2/2);
		double calculo2 = (3*num1)+(num3);
		double calculo3 = Math.pow(num3, 3);
		
		System.out.println("C�lculos - v1");
		System.out.println("Primeiro n� informado: "+num1);
		System.out.println("Segundo n� informado: "+num2);
		System.out.println("Terceiro n� informado: "+num3);
		System.out.println("o produto do dobro do primeiro com metade do segundo: "+calculo1);
		System.out.println("a soma do triplo do primeiro com o terceiro: "+calculo2);
		System.out.println("o terceiro elevado ao cubo: "+calculo3);	
		
	}

}
