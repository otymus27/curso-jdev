package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça a temperatura em graus Celsius,
			transforme e mostre em graus Farenheit.
		 * 
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da temperatura em Celsius(C):");
		double temperatura = scan.nextDouble();
											
		double tempConvertida = ((temperatura * 9)/5)+32;
		
		System.out.println("Conversão de temperatura - v1");
		System.out.println("Temperatura em Celsius(C): "+temperatura);
		System.out.println("Temperatura em Farenheit(F): "+tempConvertida);		
		
	}

}
