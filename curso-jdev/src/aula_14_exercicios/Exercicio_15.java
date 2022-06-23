package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado A do triângulo em (cm):");
		double ladoA = scan.nextDouble();
		
		System.out.println("Informe a medida do lado B do triângulo em (cm):");
		double ladoB = scan.nextDouble();
		
		System.out.println("Informe a medida do lado C do triângulo em (cm):");
		double ladoC = scan.nextDouble();
				
		System.out.println("Classificação de triângulo:");
		//faço uma verificação para ver se é triangulo.
		if((ladoA+ladoB)>ladoC && (ladoB+ladoC)>ladoA && (ladoA+ladoC)>ladoB) {
			
			if(ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Lado A do triângulo:  "+ladoA+" cm.");
				System.out.println("Lado B do triângulo:  "+ladoB+" cm.");
				System.out.println("Lado C do triângulo:  "+ladoC+" cm.");
				System.out.println("Triângulo Equilátero - todos lados iguais.");
			}else if(ladoA == ladoB ||ladoA==ladoC||ladoB==ladoC) {
				System.out.println("Lado A do triângulo:  "+ladoA+" cm.");
				System.out.println("Lado B do triângulo:  "+ladoB+" cm.");
				System.out.println("Lado C do triângulo:  "+ladoC+" cm.");
				System.out.println("Triângulo Isósceles - dois lados iguais.");
			}else  {
				System.out.println("Lado A do triângulo:  "+ladoA+" cm.");
				System.out.println("Lado B do triângulo:  "+ladoB+" cm.");
				System.out.println("Lado C do triângulo:  "+ladoC+" cm.");
				System.out.println("Triângulo Escaleno - todos lados diferentes.");
			}
		}else {
			System.out.println("Valores informados não formam um triângulo!!!");
		}
		
		
		
	}

}
