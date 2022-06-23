package aula_12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {
		@SuppressWarnings("resource")//corrige erro da classe Scanner
		Scanner scan = new Scanner(System.in);//classe para leitura de dados
		
		System.out.println("Informe seu nome:");
		String nome = scan.nextLine();//faz leitura de uma linha inteira
		
		System.out.println("Informe sua idade:");
		int idade = scan.nextInt();//faz leitura de um tipo especifico de variavel
		
		System.out.println("Informe a cidade onde mora:");
		String cidade = scan.next();//faz leitura e retorna uma String	
		
		System.out.println("Informe seu peso:");
		double peso = scan.nextDouble();
		
		System.out.println("Você possui animal de estimação:");
		boolean temBicho = scan.nextBoolean();
		
		System.out.println("Nesta aula vamos ver leitura de dados ou entrada de dados no java:");
		System.out.println("Dados Pessoais");
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Têm: "+idade+ " anos.");
		System.out.println("Mora em: "+cidade);
		System.out.println("Peso: "+peso+ "KG");
		System.out.println("Têm animal de estimação: "+temBicho);
		
		
				
	}

}
