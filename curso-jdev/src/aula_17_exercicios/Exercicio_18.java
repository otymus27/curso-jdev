package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro qualquer:");
		int num = scan.nextInt();
		
		int cont =1;
		int contPrimo=0;
		int resultado;
						
		System.out.println("N�meros primos:");
		
		while(cont <=num) {	
			resultado=num%cont;
			
			if(resultado==0) {
				contPrimo++;
			}
			cont++;
		}
		
		if(contPrimo==2||num==1) {
			System.out.println("O n�mero "+num+" � primo.");
		}else {
			System.out.println("O n�mero "+num+" n�o � primo.");
		}
		
		/*(
		for(int i=1;i<num;i++) {
			if((i == 2) || (i/i==1) && (i%2==1)) {
				if(i%3==0 &&i!=3||i%7==0 && i!=7) {
					System.out.println("O n�mero "+i+" N�O � PRIMO.");
					
				}else {
					System.out.println("O n�mero "+i+" � PRIMO.");
				}			
			}else {				
				System.out.println("O n�mero "+i+" N�O � PRIMO.");
			}
			
		}		
			*/
		
	}

}
