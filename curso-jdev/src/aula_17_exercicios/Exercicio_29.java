package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_29 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro qualquer:");
		int num = scan.nextInt();
		
		int cont=0;
		int numero;
						
		System.out.println("Números primos compreendidos entre 1 e "+num);
		for(int i=1;i<=num;i++) {			
			numero=i;
			
			for(int j=1;j<=numero;j++) {
				if(numero % j ==0 ) {
					cont++;	
				}				
			}
			if(cont==2||numero==1) {
				System.out.print(numero+" ");
			}
			
			cont=0;			
		}	
		
	}

}
