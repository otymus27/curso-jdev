package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {				
		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int num;
		int cont=1;
		int contPar=0;
		int somaPar=0;
		int somaImpar=0;
		int contImpar=0;
		String imprimir="";//variavel para printar saida do loop
						
		System.out.print("N�meros pares: ");
		do {		
			System.out.println("Informe "+cont+" n�mero inteiro qualquer:");
			num = scan.nextInt();
				
			if(num%2==0) {	
				contPar++;
				somaPar +=num;					
				imprimir+=(num+" ");	
			}else {
				somaImpar +=num;				
				contImpar++;	
				imprimir+=(num+" ");//imprimie saida do loop
			}						
			cont++;
			
		} while (cont <= 10);			
				
		System.out.println();
		System.out.println(imprimir);
		System.out.println("Soma de n�meros pares �: "+somaPar);
		System.out.println("Soma de n�meros impares �: "+somaImpar);
		System.out.println("Total de n�meros pares �: "+contPar);
		System.out.println("Total de n�meros impares �: "+contImpar);
		
	}

}
