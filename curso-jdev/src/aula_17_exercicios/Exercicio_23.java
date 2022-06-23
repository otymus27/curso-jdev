package aula_17_exercicios;

//import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {				
		
		//@SuppressWarnings("resource")
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de itens:");		
								
		int cont=1;	
		double preco=1.99;
		
		System.out.println("Loja Quase Dois - Tabela de preços");
		while(cont <=50){			
			System.out.println(cont+" - R$ "+(cont * preco));			
			cont++;	
		}
		cont--;		
		
	}

}
