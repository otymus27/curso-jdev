package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_19 {

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
		
		int resultado;
		
		if(operacao==1) {
			System.out.println("Voc� escolheu a opera��o de ADI��O:");
			resultado=num1+num2;
			System.out.println("("+num1+")+("+num2+")="+resultado);
		}else if(operacao==2){
			System.out.println("Voc� escolheu a opera��o de SUBTRA��O:");
			resultado=num1-num2;
			System.out.println("("+num1+")-("+num2+")="+resultado);	
		}else if(operacao==3) {
			System.out.println("Voc� escolheu a opera��o de MULTIPLICA��O:");
			resultado=num1*num2;
			System.out.println("("+num1+")*("+num2+")="+resultado);		
		}else {
			System.out.println("Voc� escolheu a opera��o de DIVIS�O:");
			resultado=num1/num2;
			System.out.println("("+num1+")/("+num2+")="+resultado);
		}		
		
		if(resultado % 2==0 && resultado >0) {
			System.out.println("O valor da opera��o �: um n� POSITIVO e PAR");
		}else if(resultado % 2!=0 && resultado >0) {
			System.out.println("O valor da opera��o �: um n� POSITIVO e IMPAR");
		}else if(resultado % 2==0 && resultado <0) {
			System.out.println("O valor da opera��o �: um n� NEGATIVO e PAR");
		}else {
			System.out.println("O valor da opera��o �: um n� NEGATIVO e IMPAR");
		}
		
	}

}
