package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerando um intervalo de n�meros inteiros:");
		System.out.println("Informe o primeiro n�mero: ");
		int num = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		int num2= scan.nextInt();
		
		int cont=num-1;
		int soma=0;
			
		System.out.println("Intervalo de "+num+" - "+num2);
		
		do {				
			cont++;	
			System.out.print(+cont+" ");
			soma=cont+soma;
		} while (cont <num2);	
		
		System.out.println();
		System.out.println("A soma desse intervalo de n�meros �: "+soma);
			
	}

}
