package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
			Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.		
		 * 
		 * 		
		*/
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		/*//usando char como entrada de dados
		System.out.println("Informe o sexo da pessoa:");		
		char sexo = scan.next().charAt(0);
		
		System.out.println("Op��o sexual:");
		if(sexo == 'm' || sexo == 'M') {
			System.out.println("Sexo informado �: M - Masculino");
		}else if(sexo =='f'|| sexo == 'F'){
			System.out.println("Sexo informado �: F - Feminino");
		}else {
			System.out.println("Sexo inv�lido!!!");
		}
		
		*/
		
		//usando String como entrada de dados
		System.out.println("Informe o sexo da pessoa:");		
		String sexo = scan.next();
				
		System.out.println("Op��o sexual:");
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo informado �: M - Masculino");
		}else if(sexo.equalsIgnoreCase("f")){
			System.out.println("Sexo informado �: F - Feminino");
		}else {
			System.out.println("Sexo inv�lido!!!");
		}
			

	}

}
