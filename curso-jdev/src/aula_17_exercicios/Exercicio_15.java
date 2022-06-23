package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade que deseja gerar a Sequencia de Fibbonacci: ");
		int num = scan.nextInt();		
		int numAnterior=0;
		int numAtual=1;
		int cont=0;
			
		System.out.println("Sequencia de Fibbonacci até "+num);
				
		do {	
			cont++;
			numAnterior=numAtual-numAnterior;
			numAtual=numAnterior+numAtual;			
			System.out.print(numAnterior+" ");					
		} while (cont <=num-1);
		
	}

}
