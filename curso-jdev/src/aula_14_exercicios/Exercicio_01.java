package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Compara��o de n�meros:");
		if(num1 > num2) {
			System.out.println("O maior n�mero informado foi o primeiro: "+num1);
		}else if(num1<num2) {
			System.out.println("O maior n�mero informado foi o segundo: "+num2);
		}else {
			System.out.println("Os n�meros informados s�o iguais.");
			System.out.println("S�o eles: "+num1+" e "+num2);
		}	
		

	}

}
