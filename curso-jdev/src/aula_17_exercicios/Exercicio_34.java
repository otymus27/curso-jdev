package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Somando n termos de uma séria qualquer:");
		System.out.println("Informe a quantidade que deseja calcular: ");
		int quantidade = scan.nextInt();
		
		int cont=0;		
		int numerador=cont;
		int denominador=0;
		double soma=0;			
		
		do {	
			
			if(cont==1) {
				numerador=1;
				denominador=cont;
				System.out.print(numerador+"/"+denominador+" ");
				soma +=(double)numerador/(double)denominador;				
			}else if(cont >=1) {
				numerador=1;
				denominador=denominador+1;
				System.out.print(numerador+"/"+denominador+" ");
				soma +=(double)numerador/(double)denominador;				
			}
			
			cont++;				
						
		} while (cont <=quantidade);			
		
		System.out.println();
		System.out.println("A soma de uma sequencia n de termos é: "+soma);		
			
	}

}
