package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_49 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int numInicial;
		boolean validaNumInicial=false;
		do {
			System.out.println("Informe um número inicial inteiro qualquer:");
			numInicial= scan.nextInt();
			
			if(numInicial >=0){
				validaNumInicial=true;
			}else {
				System.out.println("Número inicial não pode ser negativo!!!");
				validaNumInicial=false;
			}
			
		}while(validaNumInicial ==false);
		
		int numFinal;
		boolean validaNumFinal=false;
		do {
			System.out.println("Informe um número Final inteiro qualquer:");
			numFinal= scan.nextInt();
			
			if(numFinal >=0 && numFinal >numInicial){
				validaNumFinal=true;
			}else {
				System.out.println("Número Final não pode ser negativo e nem igual ao primeiro número!!!");
				validaNumFinal=false;
			}
			
		}while(validaNumFinal ==false);
								
		int cont=numInicial;
		int maior;
		int menor;
		int soma=0;
				
		do {
			System.out.print(cont+"-");			
			cont++;
			soma= soma+cont;
			
		} while (cont <=numFinal);
		maior=cont-1;
		menor=numInicial;
		
		System.out.println();
		System.out.println("O maior número é: "+maior);	
		System.out.println("O menor número é: "+menor);
		System.out.println("A soma dos números é: "+soma);
			
	}

}
