package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça a temperatura em graus Farenheit,
			transforme e mostre a temperatura em graus Celsius.
			C = (5 * (F-32) / 9).
		 * 
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da temperatura em Farenheit(F):");
		double temperatura = scan.nextDouble();
									
		double tempConvertida = (5*((temperatura-32)/9));
		
		System.out.println("Conversão de temperatura - v1");
		System.out.println("Temperatura em Farenheit(F): "+temperatura);
		System.out.println("Temperatura em Celsius(C): "+tempConvertida);		
		
	}

}
