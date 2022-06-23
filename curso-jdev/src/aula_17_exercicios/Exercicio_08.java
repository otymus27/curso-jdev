package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num;	
		int cont=1;
		int maior=0;
		int soma=0;
		double media=0;
		
		System.out.println("Lendo N números informados e fazendo cálculos:");
		
		do {
			System.out.println("Informe um número inteiro qualquer:");
			num=scan.nextInt();			
			if(num > maior) {
				maior=num;
			}					
		
			cont++;		
			soma =soma+num;
		} while (cont <=5);	
		
		media=soma/5;
		
		System.out.println();
		System.out.println("O maior número é: "+maior);
		System.out.println("Soma dos números: "+soma);
		System.out.println("A média dos números: "+media);
	
	}

}
