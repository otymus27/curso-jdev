package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_35 {

	public static void main(String[] args) {				
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro para a quantidade que deseja: ");
		int num = scan.nextInt();
		
		int contPar=0;
		int somaPar=0;
		int somaImpar=0;
		int contImpar=0;
			
		System.out.println("Números pares e impares entre 1 e "+num);
		
		System.out.print("Números pares: ");
		do {				
			contPar++;	
			if(contPar%2==0) {				
				somaPar=contPar + somaPar;	
				System.out.print(contPar+"-");
			}			
		} while (contPar <=num-1);	
		
		System.out.println();//esta linha é so para separar 
		System.out.print("Números impares: ");
		do {				
			contImpar++;	
			if(contImpar%2==1) {				
				somaImpar=contImpar + somaImpar;	
				System.out.print(contImpar+"-");
			}			
		} while (contImpar <=num-1);	
		
		
		System.out.println();
		System.out.println("Soma de números pares é: "+somaPar);
		System.out.println("Soma de números impares é: "+somaImpar);
	}

}
