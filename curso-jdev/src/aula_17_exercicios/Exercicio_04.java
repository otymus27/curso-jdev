package aula_17_exercicios;

//import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
					
		//@SuppressWarnings("resource")
		//Scanner scan = new Scanner(System.in);
		
		int populacaoA = 80000;		
		double populacaoB = 200000;		
		int contAno=0;
			
		
		while(populacaoA <=populacaoB) {
			populacaoA = populacaoA + (populacaoA*3)/100;
			populacaoB = populacaoB + (populacaoB*1.5)/100;
			contAno++;
		}
				
		System.out.println("------Censo Demografico-----");
		System.out.println("Popula��o de A, ap�s:"+contAno+" anos ser� de "+populacaoA);
		System.out.println("Popula��o de B, ap�s:"+contAno+" anos ser� de "+populacaoB);
						

	}

}
