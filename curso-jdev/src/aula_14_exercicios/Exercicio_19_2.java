package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_19_2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		
		
		System.out.println("Opera��es com n�meros:");		
		System.out.println("Informe umas das 04 opera��es que deseja fazer:");
		System.out.println("1 - ADI��O , 2 - SUBTRA��O, 3 - MULTIPLICA��O, 4 - DIVIS�O");				
		int operacao = scan.nextInt();
		
		int resultado=0;
		boolean valida = true;
		
		switch (operacao) {		
			case 1:
				resultado = (num1)+(num2);
				break;
			case 2:
				resultado = (num1) - (num2);
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				resultado = num1 / num2;
				break;			
			default:
				System.out.println("Opera��o inv�lida!!!");
				valida = false; //isto � uma flag(bandeira) que inicia com um valor true e muda para false aqui
		}
		
		
		if(valida) {
			System.out.println("Resultado da opera��o: "+resultado);
			
			if(resultado >=0 ) {
				System.out.println("O valor da opera��o �: um n� POSITIVO.");
			}else {
				System.out.println("O valor da opera��o � um n� NEGATIVO.");
			}
			
			if(resultado %2 ==0) {
				System.out.println("O valor da opera��o �: um n� PAR.");
			}else {
				System.out.println("O valor da opera��o �: um n� IMPAR.");
			}
				
		}		
		
	}
}
