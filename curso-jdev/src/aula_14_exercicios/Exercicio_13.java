package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dia da semana:");
		System.out.println("1 - Domingo, 2 - Segunda, 3 - Ter�a, 4 - Quarta, 5 - Quinta, 6 - Sexta, 7 - S�bado");
		System.out.println("Informe um n�mero como op��o:");
		int diaSemana = scan.nextInt();			
								
		System.out.println("Dias da semana:");
		switch (diaSemana) {		
			case 1: 			
				System.out.println("Hoje � Domingo - Vamos passear.");
				break;
			case 2:
				System.out.println("Hoje � Segunda - Dia de trabalhar.");
				break;
			case 3:
				System.out.println("Hoje � Ter�a - Dia de trabalhar.");
				break;
			case 4:
				System.out.println("Hoje � Quarta - Dia de trabalhar.");
				break;	
			case 5:
				System.out.println("Hoje � Quinta - Dia de trabalhar.");
				break;	
			case 6:
				System.out.println("Hoje � Sexta - Dia de trabalhar.");
				break;	
			case 7:
				System.out.println("Hoje � S�bado - Dia de ir na feira.");
				break;	
			default:			
				System.out.println("Op��o inv�lida!!!.");	
				break;			
		}
		
	}

}
