package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Interrogatório:");		
		System.out.println("Responda às questões com um: 1 - SIM , 2 - NÃO/n");
		
		System.out.println("Telefoneu para a vítima?");
		int questao1=scan.nextInt();
		
		System.out.println("Esteve no local do crime?");
		int questao2=scan.nextInt();
		
		System.out.println("Mora perto da vítima?");
		int questao3=scan.nextInt();
		
		System.out.println("Devia para a vítima?");
		int questao4=scan.nextInt();
		
		System.out.println("Já trabalhou com a vítima?");
		int questao5=scan.nextInt();
									
		int resultado=questao1+questao2+questao3+questao4+questao5;			
		
		System.out.println("Resultado da investigação:");
		if(resultado >8 && resultado <=10) {			
			System.out.println("INOCENTE!!!");
		}else if(resultado >=6 && resultado <=8) {			
			System.out.println("CÚMPLICE!!!");
		}else if(resultado ==4) {			
			System.out.println("SUSPEITO!!!");
		}else if(resultado ==5){
			System.out.println("ASSASSINO!!!");
		}else {			
			System.out.println("INCONCLUSIVO - REFAZER INVESTIGAÇÃO!!!");
		}
		
	}

}
