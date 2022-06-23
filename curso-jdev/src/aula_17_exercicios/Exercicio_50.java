package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_50 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando qualquer fatorial:");		
		int resposta;	
		
		System.out.println("Deseja calcular o fatorial ?");
		System.out.println("1 - Sim  2 - Sair");
		resposta =scan.nextInt();
		
		
		boolean valida=false;
		if(resposta==1) {
			
			do {
				System.out.println("Informe o fatorial: ");
				int fatorial = scan.nextInt();
								
				int cont=0;
				int resultado=fatorial;
					
				System.out.print("Fatorial de "+fatorial+"!="+fatorial+".");
				
				do {				
					cont++;					
					System.out.print(fatorial-cont+".");
					resultado = resultado * (fatorial-cont);
					
				} while (cont <fatorial-1);	
				
				System.out.println();
				System.out.println("O resultado do fatorial de "+fatorial+" é igual a: "+resultado);
				
				System.out.println("Deseja fazer outro calculo");
				System.out.println("1 - Sim  2 - Sair");
				resposta = scan.nextInt();
				if(resposta==1) {
					valida=false;
				}else {
					valida=true;
				}
				
			}while(valida==false);			
		}
		
		System.out.println("Programa Finalizado!!!");
		
	}

}
