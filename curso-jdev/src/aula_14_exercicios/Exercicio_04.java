package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.			 
		 * 		
		*/
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sexo da pessoa:");
		String letra = scan.next();
		
					
		if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
			System.out.println("A letra informada é uma vogal: "+letra);
		}else {
			System.out.println("A letra informada é uma consoante: "+letra);
		}
		
		
		
	}

}
