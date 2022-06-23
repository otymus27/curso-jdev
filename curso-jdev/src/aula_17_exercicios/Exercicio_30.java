package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerando uma tabuada de multiplicação entre qualquer intervalo:");
		System.out.println("Informe um número inicial inteiro: ");
		int numInicial = scan.nextInt();
		int numFinal;
		
		//fazendo a validação do número final do intervalo da tabuada
		boolean valida=false;
		do {
			System.out.println("Informe um número final inteiro:");
			numFinal = scan.nextInt();
			if(numFinal >=numInicial) {				
				valida=true;
			}else {
				System.out.println("Número final não pode ser menor que o inicial!!!");
				System.out.println("Informe um número maior que o número inicial:");
				valida=false;
			}
		}while(valida ==false);
		
		System.out.println("Informe o número multiplicador:");
		int num=scan.nextInt();
			
		int cont=numInicial;		
			
		System.out.println("Tabuada de: "+num);
		System.out.println("Começa por: "+numInicial);
		System.out.println("Termina em: "+numFinal);
		System.out.println("Tabuada de "+num+" entre "+numInicial+" e "+numFinal);
		
		do {
			System.out.println(+cont+" x "+num+"="+cont*num);		
			cont++;	
		} while (cont <=numFinal);	
			
	}

}
