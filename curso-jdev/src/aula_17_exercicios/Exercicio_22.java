package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando valor m�dio de compra:");		
				
		System.out.println("Informe a quantidade de itens comprados ?");
		int quantidade = scan.nextInt();
		
		int cont=1;
		double soma=0;
		double media;	
		
		while(cont <=quantidade){
			System.out.println("Informe o valor do "+cont+"� item:");
			double valor = scan.nextDouble();
			
			System.out.println("Valor do item "+cont+" = R$ "+valor);			
			soma=soma + valor;
			cont++;					
		}
		cont--;			
		media=soma/cont;
		
		System.out.println();
		System.out.println("Resumo da compra");
		System.out.println("Foram comprados "+(cont)+" itens.");	
		System.out.println("A m�dia de pre�o dos itens comprados �: R$ "+media+".");
		System.out.println("O pre�o total dos itens comprados �: R$ "+soma+".");
		
	}

}
