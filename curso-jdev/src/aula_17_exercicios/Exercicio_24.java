package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de itens:");
		
		System.out.println("Informe o pre�o atual do p�o:");
		double preco=scan.nextDouble();
							
		int cont=1;			
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		while(cont <=50){			
			System.out.println(cont+" - R$ "+(cont * preco));			
			cont++;	
		}
		cont--;		
		
	}

}
