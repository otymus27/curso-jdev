package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número inteiro:");
		int num3 = scan.nextInt();				
		
		System.out.println("Comparação de números:");
		if((num1 >= num2) && (num2 >= num3)) {			
			System.out.println("Os números em ordem decrescente são: "+num1+"-"+num2+"-"+num3);
		}else if((num1 <= num2) && (num1 >= num3)) {			
			System.out.println("Os números em ordem decrescente são: "+num2+"-"+num1+"-"+num3);
		}else if(num1 >= num3 && num2 <= num3) {			
			System.out.println("Os números em ordem decrescente são: "+num1+"-"+num3+"-"+num2);
		}else if(num1 <= num2 && num2>=num3) {			
			System.out.println("Os números em ordem decrescente são: "+num2+"-"+num3+"-"+num1);
		}else if(num1 <= num2 && num2 <= num3) {
			System.out.println("Os números em ordem decrescente são: "+num3+"-"+num2+"-"+num1);			
		}else {
			System.out.println("Os números em ordem decrescente são: "+num3+"-"+num1+"-"+num2);			
		}
	}

}
