package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
					
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro n�mero inteiro:");
		int num3 = scan.nextInt();
		
		System.out.println("Compara��o de n�meros:");
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero informado foi o primeiro: "+num1);
		}else if(num1 < num2 && num2 > num3) {
			System.out.println("O maior n�mero informado foi o segundo: "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("O maior n�mero informado foi o terceiro: "+num3);
		}else {
			System.out.println("Informe n�meros diferentes para comparar!!!");
		}
		
	}

}
