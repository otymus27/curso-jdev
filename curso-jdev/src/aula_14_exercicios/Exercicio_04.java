package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.			 
		 * 		
		*/
			
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o sexo da pessoa:");
		String letra = scan.next();
		
					
		if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
			System.out.println("A letra informada � uma vogal: "+letra);
		}else {
			System.out.println("A letra informada � uma consoante: "+letra);
		}
		
		
		
	}

}
