package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do raio em centímetros(cm):");
		double raio = scan.nextDouble();
						
		double area = (3.14) * Math.pow(raio, 2);//Math.pow - classe para potencia
		
		System.out.println("Área do circulo - v1");
		System.out.println("Medida do raio informada em centímetros(cm): "+raio);
		System.out.println("Área do circulo em centímetros: "+area);
		
	}

}
