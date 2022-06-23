package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_19_2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro:");
		int num2 = scan.nextInt();
		
		
		System.out.println("Operações com números:");		
		System.out.println("Informe umas das 04 operações que deseja fazer:");
		System.out.println("1 - ADIÇÃO , 2 - SUBTRAÇÃO, 3 - MULTIPLICAÇÃO, 4 - DIVISÃO");				
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
				System.out.println("Operação inválida!!!");
				valida = false; //isto é uma flag(bandeira) que inicia com um valor true e muda para false aqui
		}
		
		
		if(valida) {
			System.out.println("Resultado da operação: "+resultado);
			
			if(resultado >=0 ) {
				System.out.println("O valor da operação é: um nº POSITIVO.");
			}else {
				System.out.println("O valor da operação é um nº NEGATIVO.");
			}
			
			if(resultado %2 ==0) {
				System.out.println("O valor da operação é: um nº PAR.");
			}else {
				System.out.println("O valor da operação é: um nº IMPAR.");
			}
				
		}		
		
	}
}
