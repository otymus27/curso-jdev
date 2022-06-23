package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano com quatro algarimos:");
		int ano = scan.nextInt();
						
		
		System.out.println("Identificar o ano bissexto:");
		
		if(ano % 4 == 0 && ano % 100!=0 ) {
			System.out.println("O ano de "+ano+" é BISSEXTO.");
		}else if(ano % 400 == 0 && ano % 100==0 ) {
			System.out.println("O ano de "+ano+" é BISSEXTO.");
		}else {
			System.out.println("O ano de "+ano+" não é BISSEXTO.");
		}
		
	}

}
