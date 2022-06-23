package aula_16;

import java.util.Scanner;

public class RepeticaoWhile {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade que deseja contar:");
		int quantidade = scan.nextInt();	
		int i = 1; //contador
		
								
		System.out.println("Usando comando de repetição while:");
		System.out.println("O comando while, verifica um expressão"
				+ " ou condição de um bloco e executa até que a condição fique falsa.");
		
		while (i <= quantidade) {
			System.out.println("valor de i = "+i);
			i++; //i=i + i
		}
		i--;
		System.out.println("Imprimindo a quantidade que foi repetida = "+ i);
	}

}
