package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
		//positivo ou negativo.
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro:");
		int num = scan.nextInt();
		
		System.out.println("Compara��o de n�meros:");
		
		if(num > 0) {
			System.out.println("N�mero informado � positivo: "+num);
		}else if(num >=0) {
			System.out.println("N�mero informado � nulo: "+num);
		}else {
			System.out.println("N�mero informado � negativo. "+num);
		}
		

	}

}
