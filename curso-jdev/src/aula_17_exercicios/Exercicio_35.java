package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_35 {

	public static void main(String[] args) {				
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro para a quantidade que deseja: ");
		int num = scan.nextInt();
		
		int contPar=0;
		int somaPar=0;
		int somaImpar=0;
		int contImpar=0;
			
		System.out.println("N�meros pares e impares entre 1 e "+num);
		
		System.out.print("N�meros pares: ");
		do {				
			contPar++;	
			if(contPar%2==0) {				
				somaPar=contPar + somaPar;	
				System.out.print(contPar+"-");
			}			
		} while (contPar <=num-1);	
		
		System.out.println();//esta linha � so para separar 
		System.out.print("N�meros impares: ");
		do {				
			contImpar++;	
			if(contImpar%2==1) {				
				somaImpar=contImpar + somaImpar;	
				System.out.print(contImpar+"-");
			}			
		} while (contImpar <=num-1);	
		
		
		System.out.println();
		System.out.println("Soma de n�meros pares �: "+somaPar);
		System.out.println("Soma de n�meros impares �: "+somaImpar);
	}

}
