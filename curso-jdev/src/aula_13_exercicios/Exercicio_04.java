package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
				
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota do primeiro bimestre:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota do segundo bimestre:");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a nota do terceiro bimestre:");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a nota do quarto bimestre:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Boletim Escolar - v1");
		System.out.println("Nota do 1º bimestre: "+nota1);
		System.out.println("Nota do 2º bimestre: "+nota2);
		System.out.println("Nota do 3º bimestre: "+nota3);
		System.out.println("Nota do 4º bimestre: "+nota4);
		System.out.println("A nota final é: "+media);

	}

}
