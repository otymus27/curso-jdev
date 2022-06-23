package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número inteiro:");
		int num3 = scan.nextInt();
		
		//aqui faço uma verificação para nenhum número ser repetido
		if(num1!=num2 && num1!=num3 && num2!=num3) {
			System.out.println("Comparação de números:");
			//aqui faço comparação para descobrir o maior número informado.
			if(num1 > num2 && num1 > num3) {
				System.out.println("O maior número informado foi o primeiro: "+num1);
			}else if(num1 < num2 && num2 > num3) {
				System.out.println("O maior número informado foi o segundo: "+num2);
			}else {
				System.out.println("O maior número informado foi o terceiro: "+num3);
			}
			
			//aqui faço comparação para descobrir o menor número informado.
			if(num1 < num2 && num1 < num3) {
				System.out.println("O menor número informado foi o primeiro: "+num1);
			}else if(num2 < num1 && num2 < num3) {
				System.out.println("O menor número informado foi o segundo: "+num2);
			}else {
				System.out.println("O menor número informado foi o terceiro: "+num3);
			}
			
		}else {
			System.out.println("Informe números diferentes para comparar!!!");
		}				
		
	}

}
