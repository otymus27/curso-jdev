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
						
		System.out.print("Números pares: ");
		do {		
			System.out.println("Informe "+cont+" número inteiro qualquer:");
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
		System.out.println("Soma de números pares é: "+somaPar);
		System.out.println("Soma de números impares é: "+somaImpar);
		System.out.println("Total de números pares é: "+contPar);
		System.out.println("Total de números impares é: "+contImpar);
		
	}

}
