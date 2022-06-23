package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_19 {

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
		
		int resultado;
		
		if(operacao==1) {
			System.out.println("Você escolheu a operação de ADIÇÃO:");
			resultado=num1+num2;
			System.out.println("("+num1+")+("+num2+")="+resultado);
		}else if(operacao==2){
			System.out.println("Você escolheu a operação de SUBTRAÇÃO:");
			resultado=num1-num2;
			System.out.println("("+num1+")-("+num2+")="+resultado);	
		}else if(operacao==3) {
			System.out.println("Você escolheu a operação de MULTIPLICAÇÃO:");
			resultado=num1*num2;
			System.out.println("("+num1+")*("+num2+")="+resultado);		
		}else {
			System.out.println("Você escolheu a operação de DIVISÃO:");
			resultado=num1/num2;
			System.out.println("("+num1+")/("+num2+")="+resultado);
		}		
		
		if(resultado % 2==0 && resultado >0) {
			System.out.println("O valor da operação é: um nº POSITIVO e PAR");
		}else if(resultado % 2!=0 && resultado >0) {
			System.out.println("O valor da operação é: um nº POSITIVO e IMPAR");
		}else if(resultado % 2==0 && resultado <0) {
			System.out.println("O valor da operação é: um nº NEGATIVO e PAR");
		}else {
			System.out.println("O valor da operação é: um nº NEGATIVO e IMPAR");
		}
		
	}

}
