package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
			Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.		
		 * 
		 * 		
		*/
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		/*//usando char como entrada de dados
		System.out.println("Informe o sexo da pessoa:");		
		char sexo = scan.next().charAt(0);
		
		System.out.println("Opção sexual:");
		if(sexo == 'm' || sexo == 'M') {
			System.out.println("Sexo informado é: M - Masculino");
		}else if(sexo =='f'|| sexo == 'F'){
			System.out.println("Sexo informado é: F - Feminino");
		}else {
			System.out.println("Sexo inválido!!!");
		}
		
		*/
		
		//usando String como entrada de dados
		System.out.println("Informe o sexo da pessoa:");		
		String sexo = scan.next();
				
		System.out.println("Opção sexual:");
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo informado é: M - Masculino");
		}else if(sexo.equalsIgnoreCase("f")){
			System.out.println("Sexo informado é: F - Feminino");
		}else {
			System.out.println("Sexo inválido!!!");
		}
			

	}

}
