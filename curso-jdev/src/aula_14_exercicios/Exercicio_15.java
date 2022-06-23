package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado A do tri�ngulo em (cm):");
		double ladoA = scan.nextDouble();
		
		System.out.println("Informe a medida do lado B do tri�ngulo em (cm):");
		double ladoB = scan.nextDouble();
		
		System.out.println("Informe a medida do lado C do tri�ngulo em (cm):");
		double ladoC = scan.nextDouble();
				
		System.out.println("Classifica��o de tri�ngulo:");
		//fa�o uma verifica��o para ver se � triangulo.
		if((ladoA+ladoB)>ladoC && (ladoB+ladoC)>ladoA && (ladoA+ladoC)>ladoB) {
			
			if(ladoA == ladoB && ladoB == ladoC) {
				System.out.println("Lado A do tri�ngulo:  "+ladoA+" cm.");
				System.out.println("Lado B do tri�ngulo:  "+ladoB+" cm.");
				System.out.println("Lado C do tri�ngulo:  "+ladoC+" cm.");
				System.out.println("Tri�ngulo Equil�tero - todos lados iguais.");
			}else if(ladoA == ladoB ||ladoA==ladoC||ladoB==ladoC) {
				System.out.println("Lado A do tri�ngulo:  "+ladoA+" cm.");
				System.out.println("Lado B do tri�ngulo:  "+ladoB+" cm.");
				System.out.println("Lado C do tri�ngulo:  "+ladoC+" cm.");
				System.out.println("Tri�ngulo Is�sceles - dois lados iguais.");
			}else  {
				System.out.println("Lado A do tri�ngulo:  "+ladoA+" cm.");
				System.out.println("Lado B do tri�ngulo:  "+ladoB+" cm.");
				System.out.println("Lado C do tri�ngulo:  "+ladoC+" cm.");
				System.out.println("Tri�ngulo Escaleno - todos lados diferentes.");
			}
		}else {
			System.out.println("Valores informados n�o formam um tri�ngulo!!!");
		}
		
		
		
	}

}
