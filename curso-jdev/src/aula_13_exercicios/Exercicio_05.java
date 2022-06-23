package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida em metros(m):");
		double medida = scan.nextDouble();
						
		double medidaConvertida = medida * 100;
		
		System.out.println("Conversor de medidas - v1");
		System.out.println("Medida em metros informada: "+medida);
		System.out.println("Medida convertida em centímetros: "+medidaConvertida);
		
	}

}
