package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_09 {

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
		if((num1 >= num2) && (num2 >= num3)) {			
			System.out.println("Os n�meros em ordem decrescente s�o: "+num1+"-"+num2+"-"+num3);
		}else if((num1 <= num2) && (num1 >= num3)) {			
			System.out.println("Os n�meros em ordem decrescente s�o: "+num2+"-"+num1+"-"+num3);
		}else if(num1 >= num3 && num2 <= num3) {			
			System.out.println("Os n�meros em ordem decrescente s�o: "+num1+"-"+num3+"-"+num2);
		}else if(num1 <= num2 && num2>=num3) {			
			System.out.println("Os n�meros em ordem decrescente s�o: "+num2+"-"+num3+"-"+num1);
		}else if(num1 <= num2 && num2 <= num3) {
			System.out.println("Os n�meros em ordem decrescente s�o: "+num3+"-"+num2+"-"+num1);			
		}else {
			System.out.println("Os n�meros em ordem decrescente s�o: "+num3+"-"+num1+"-"+num2);			
		}
	}

}
