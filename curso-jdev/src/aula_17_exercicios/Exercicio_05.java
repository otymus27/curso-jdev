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
			System.out.println("Informe o n�mero de habitantes da popula��o A:");
			populacaoA = scan.nextDouble();
			if(populacaoA >0) {				
				valida=true;
			}else {
				System.out.println("N�mero informado inv�lido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);
		
		valida=false;		
		do {
			System.out.println("Informe o percentual anual de crescimento da popula��o A:");
			percentualA = scan.nextDouble();
			if(percentualA >0) {				
				valida=true;
			}else {
				System.out.println("N�mero informado inv�lido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);		
		
		valida=false;		
		do {
			System.out.println("Informe o n�mero de habitantes da popula��o B:");
			populacaoB = scan.nextDouble();
			if(populacaoB >0) {				
				valida=true;
			}else {
				System.out.println("N�mero informado inv�lido, informe novamente!!!");
				valida=false;
			}			
		} while (valida==false);
		
		valida=false;		
		do {
			System.out.println("Informe o percentual anual de crescimento da popula��o B:");
			percentualB = scan.nextDouble();
			if(percentualB >0) {				
				valida=true;
			}else {
				System.out.println("N�mero informado inv�lido, informe novamente!!!");
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
		System.out.println("Popula��o de A, ap�s:"+contA+" anos ser� de "+populacaoA);
		System.out.println("Popula��o de B, ap�s:"+contA+" anos ser� de "+populacaoB);

	}

}
