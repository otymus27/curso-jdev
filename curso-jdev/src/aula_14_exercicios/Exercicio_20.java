package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Interrogat�rio:");		
		System.out.println("Responda �s quest�es com um: 1 - SIM , 2 - N�O/n");
		
		System.out.println("Telefoneu para a v�tima?");
		int questao1=scan.nextInt();
		
		System.out.println("Esteve no local do crime?");
		int questao2=scan.nextInt();
		
		System.out.println("Mora perto da v�tima?");
		int questao3=scan.nextInt();
		
		System.out.println("Devia para a v�tima?");
		int questao4=scan.nextInt();
		
		System.out.println("J� trabalhou com a v�tima?");
		int questao5=scan.nextInt();
									
		int resultado=questao1+questao2+questao3+questao4+questao5;			
		
		System.out.println("Resultado da investiga��o:");
		if(resultado >8 && resultado <=10) {			
			System.out.println("INOCENTE!!!");
		}else if(resultado >=6 && resultado <=8) {			
			System.out.println("C�MPLICE!!!");
		}else if(resultado ==4) {			
			System.out.println("SUSPEITO!!!");
		}else if(resultado ==5){
			System.out.println("ASSASSINO!!!");
		}else {			
			System.out.println("INCONCLUSIVO - REFAZER INVESTIGA��O!!!");
		}
		
	}

}
