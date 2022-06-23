package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		//Faça um Programa que peça um valor e mostre na tela se o valor é
		//positivo ou negativo.
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int num = scan.nextInt();
		
		System.out.println("Comparação de números:");
		
		if(num > 0) {
			System.out.println("Número informado é positivo: "+num);
		}else if(num >=0) {
			System.out.println("Número informado é nulo: "+num);
		}else {
			System.out.println("Número informado é negativo. "+num);
		}
		

	}

}
