package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_48 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inicial inteiro qualquer:");
		int numInicial= scan.nextInt();
		
		System.out.println("Informe um número final inteiro qualquer");
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
		System.out.println("O maior número é: "+maior);	
		System.out.println("O menor número é: "+menor);
		System.out.println("A soma dos números é: "+soma);
			
	}

}
