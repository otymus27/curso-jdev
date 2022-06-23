package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
					
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu nome:");
		String nome = scan.nextLine();
		while(nome.length() <=3) {
			System.out.println("N�meros de caracteres inferior a 3, informe novamente!!!");
			System.out.println("Informe o seu nome:");
			nome = scan.next();
		}
		
		int idade;
		System.out.println("Informe a sua idade:");
		idade = scan.nextInt();
		while(idade <=0 || idade >150) {
			System.out.println("Idade inv�lida, informe a idade entre 0 e 150!!!");
			System.out.println("Informe a sua idade:");
			idade = scan.nextInt();
		}
		
		double salario;
		System.out.println("Informe o sal�rio da pessoa em R$:");
		salario = scan.nextDouble();
		while(salario <=0) {
			System.out.println("Sal�rio inv�lido, sal�rio n�o pode ser menor que 0!!!");
			System.out.println("Informe o sal�rio da pessoa em R$:");
			salario = scan.nextDouble();
		}
		
		String sexo;
		boolean valida = false;
		//valida��o do sexo		
		do {
			System.out.println("Informe o sexo da pessoa:");
			System.out.println("Digite M - Masculino  F - Feminino");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("m")||sexo.equalsIgnoreCase("f")) {				
				valida=true;
			}else {
				System.out.println("Sexo inv�lido, informe novamente");
				valida=false;
			}			
		}while(valida==false);
		
		String estadoCivil;
		valida = false;
		//valida��o do estado civil
		do {
			System.out.println("Informe o estado civil da pessoa:");
			System.out.println("Digite S - Solteiro  C - Casado   V - Viuvo   D - Divorciado");
			estadoCivil = scan.next();
			if(estadoCivil.equalsIgnoreCase("s")||estadoCivil.equalsIgnoreCase("c")||estadoCivil.equalsIgnoreCase("v")||estadoCivil.equalsIgnoreCase("d")) {							
				valida=true;
			}else {
				System.out.println("Estado civil inv�lido, informe novamente");
				valida=false;
			}			
		}while(valida==false);
		
		System.out.println("------DADOS PESSOAIS-----");
		System.out.println("Nome Completo:"+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sal�rio R$: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado civil: "+estadoCivil);
					

	}

}
