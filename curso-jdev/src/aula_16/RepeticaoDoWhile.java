package aula_16;

import java.util.Scanner;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade que deseja contar:");
		int quantidade = scan.nextInt();	
		int i = 0; //contador
										
		System.out.println("Usando comando de repetição do while:");
		System.out.println("O comando do while, executa um bloco e depois verifica a condição,"
				+ "caso seja falsa o bloco para de ser executado.");
		
		do {
			i++;//i=i+i
			System.out.println("valor de i = "+i);
		}while(i < quantidade);//quando a condição for falsa, o bloco deixa de ser executado.
						
		System.out.println("Imprimindo a quantidade que foi repetida = "+ i);
	}

}
