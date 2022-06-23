package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		//Faça um Programa que peça dois números e imprima o maior deles.
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Comparação de números:");
		if(num1 > num2) {
			System.out.println("O maior número informado foi o primeiro: "+num1);
		}else if(num1<num2) {
			System.out.println("O maior número informado foi o segundo: "+num2);
		}else {
			System.out.println("Os números informados são iguais.");
			System.out.println("São eles: "+num1+" e "+num2);
		}	
		

	}

}
