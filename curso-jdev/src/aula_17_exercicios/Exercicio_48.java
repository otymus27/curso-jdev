package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_48 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um n�mero inicial inteiro qualquer:");
		int numInicial= scan.nextInt();
		
		System.out.println("Informe um n�mero final inteiro qualquer");
		int numFinal= scan.nextInt();
				
		int cont=numInicial;
		int maior;
		int menor;
		int soma=0;
				
		do {
			System.out.print(cont+"-");			
			cont++;
			soma= soma+cont;
			
		} while (cont <=numFinal);
		maior=cont-1;
		menor=numInicial;
		
		System.out.println();
		System.out.println("O maior n�mero �: "+maior);	
		System.out.println("O menor n�mero �: "+menor);
		System.out.println("A soma dos n�meros �: "+soma);
			
	}

}
