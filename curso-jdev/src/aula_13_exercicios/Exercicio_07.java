package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		/*Faça um Programa que calcule a área de um quadrado, em seguida
		mostre o dobro desta área para o usuário.
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado de um quadrado em centímetros(cm):");
		double lado = scan.nextDouble();
						
		double area = Math.pow(lado, 2);//Math.pow - classe para potencia
		double dobroArea = area * 2;
		
		System.out.println("Área do quadrado - v1");
		System.out.println("Medida do lado do quadrado informada em centímetros(cm): "+lado);
		System.out.println("Área do quadrado em centímetros: "+area);
		System.out.println("Dobro da área calculada: "+dobroArea);
		
	}

}
