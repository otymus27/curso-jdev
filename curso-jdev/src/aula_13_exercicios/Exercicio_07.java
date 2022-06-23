package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		/*Fa�a um Programa que calcule a �rea de um quadrado, em seguida
		mostre o dobro desta �rea para o usu�rio.
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado de um quadrado em cent�metros(cm):");
		double lado = scan.nextDouble();
						
		double area = Math.pow(lado, 2);//Math.pow - classe para potencia
		double dobroArea = area * 2;
		
		System.out.println("�rea do quadrado - v1");
		System.out.println("Medida do lado do quadrado informada em cent�metros(cm): "+lado);
		System.out.println("�rea do quadrado em cent�metros: "+area);
		System.out.println("Dobro da �rea calculada: "+dobroArea);
		
	}

}
