package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de itens:");
		
		System.out.println("Informe o preço atual do pão:");
		double preco=scan.nextDouble();
							
		int cont=1;			
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		while(cont <=50){			
			System.out.println(cont+" - R$ "+(cont * preco));			
			cont++;	
		}
		cont--;		
		
	}

}
