package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha o turno desejado:");
		System.out.println("M - MATUTINO:");
		System.out.println("V - VESPERTINO:");
		System.out.println("N - NOTURNO:");		
		String turno = scan.next();
												
		System.out.println("Secretaria Escolar - v1");		
		if(turno.equalsIgnoreCase("M")) {
			System.out.println("Você escolheu o turno: "+turno+" MATUTINO - Bom dia!!!");
		}else if(turno.equalsIgnoreCase("v")) {
			System.out.println("Você escolheu o turno: "+turno+" VESPERTINO - Boa tarde!!!");
		}else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Você escolheu o turno: "+turno+" NOTURNO - Boa noite!!!");
		}else {
			System.out.println("Opção inválida!!!.");	
		}				
		
	}

}
