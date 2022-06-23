package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
					
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		
		double populacaoA = 0;	
		double populacaoB = 0;
		double percentualA = 0;
		double percentualB = 0;
		
		boolean valida=false;		
		do {
			System.out.println("Informe o número de habitantes da população A:");
			populacaoA = scan.nextDouble();
			if(populacaoA >0) {				
				valida=true;
			}else {
				System.out.println("Número informado inválido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);
		
		valida=false;		
		do {
			System.out.println("Informe o percentual anual de crescimento da população A:");
			percentualA = scan.nextDouble();
			if(percentualA >0) {				
				valida=true;
			}else {
				System.out.println("Número informado inválido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);		
		
		valida=false;		
		do {
			System.out.println("Informe o número de habitantes da população B:");
			populacaoB = scan.nextDouble();
			if(populacaoB >0) {				
				valida=true;
			}else {
				System.out.println("Número informado inválido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);
		
		valida=false;		
		do {
			System.out.println("Informe o percentual anual de crescimento da população B:");
			percentualB = scan.nextDouble();
			if(percentualB >0) {				
				valida=true;
			}else {
				System.out.println("Número informado inválido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);		
					
		int contA=0;
		
		if(populacaoA <populacaoB) {
			while(populacaoA <populacaoB) {
				populacaoA = populacaoA + (populacaoA*percentualA)/100;
				populacaoB = populacaoB + (populacaoB*percentualB)/100;
				contA++;
			}
		}else {
			while(populacaoA >populacaoB) {
				populacaoA = populacaoA + (populacaoA*percentualA)/100;
				populacaoB = populacaoB + (populacaoB*percentualB)/100;
				contA++;
			}
		}
						
		System.out.println("------Censo Demografico-----");
		System.out.println("População de A, após:"+contA+" anos será de "+populacaoA);
		System.out.println("População de B, após:"+contA+" anos será de "+populacaoB);

	}

}
