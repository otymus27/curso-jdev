package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando média de N notas:");		
				
		System.out.println("Informe a quantidade de notas que deseja calcular a média ?");
		int quantidadeNota = scan.nextInt();
		
		int cont=1;
		double soma=0;
		double media;	
		
		while(cont <=quantidadeNota){
			System.out.println("Informe a nota de número "+cont);
			double nota = scan.nextDouble();
			
			System.out.println("Nota "+cont+" = "+nota);
			
			soma=soma + nota;
			cont++;
		}
		cont--;
		
		System.out.println("Programa Finalizado!!!");
		media=soma/cont;
		System.out.println("Foram informadas "+(cont)+" notas.");
		System.out.println("A média das notas informadas é: "+media);
	}

}
