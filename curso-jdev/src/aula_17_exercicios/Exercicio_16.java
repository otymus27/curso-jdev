package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero para gerar a Sequencia de Fibbonacci: ");
		int num = scan.nextInt();		
		int numAnterior=0;
		int numAtual=1;
					
		System.out.println("Sequencia de Fibbonacci at� "+num);				
		do {			
			numAnterior=numAtual-numAnterior;
			numAtual=numAnterior+numAtual;			
			System.out.print(numAnterior+" ");					
		} while (numAnterior <num);	
		
	}

}
