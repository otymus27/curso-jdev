package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do raio em cent�metros(cm):");
		double raio = scan.nextDouble();
						
		double area = (3.14) * Math.pow(raio, 2);//Math.pow - classe para potencia
		
		System.out.println("�rea do circulo - v1");
		System.out.println("Medida do raio informada em cent�metros(cm): "+raio);
		System.out.println("�rea do circulo em cent�metros: "+area);
		
	}

}
