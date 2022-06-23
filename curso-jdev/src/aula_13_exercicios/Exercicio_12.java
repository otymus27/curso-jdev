package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa, construa um
		algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
		(72.7*altura) - 58
		 *  
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura em (cm):");
		double altura = scan.nextDouble();
		
		double pesoIdeal = ((72.27*altura)-58);			
				
		System.out.println("Peso Ideal - v1");
		System.out.println("Altura informada: "+altura+" cm");
		System.out.println("Seu peso ideal é de: "+pesoIdeal+" Kg");
		
		
	}

}
