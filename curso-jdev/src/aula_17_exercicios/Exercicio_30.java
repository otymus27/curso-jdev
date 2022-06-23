package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerando uma tabuada de multiplica��o entre qualquer intervalo:");
		System.out.println("Informe um n�mero inicial inteiro: ");
		int numInicial = scan.nextInt();
		int numFinal;
		
		//fazendo a valida��o do n�mero final do intervalo da tabuada
		boolean valida=false;
		do {
			System.out.println("Informe um n�mero final inteiro:");
			numFinal = scan.nextInt();
			if(numFinal >=numInicial) {				
				valida=true;
			}else {
				System.out.println("N�mero final n�o pode ser menor que o inicial!!!");
				System.out.println("Informe um n�mero maior que o n�mero inicial:");
				valida=false;
			}
		}while(valida ==false);
		
		System.out.println("Informe o n�mero multiplicador:");
		int num=scan.nextInt();
			
		int cont=numInicial;		
			
		System.out.println("Tabuada de: "+num);
		System.out.println("Come�a por: "+numInicial);
		System.out.println("Termina em: "+numFinal);
		System.out.println("Tabuada de "+num+" entre "+numInicial+" e "+numFinal);
		
		do {
			System.out.println(+cont+" x "+num+"="+cont*num);		
			cont++;	
		} while (cont <=numFinal);	
			
	}

}
