package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês.
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada em R$:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas:");
		double quantidadeHora = scan.nextDouble();
						
		double salario = valorHora*quantidadeHora;
		
		System.out.println("Folha de pagamento - v1");
		System.out.println("Quantidade de horas trabalhadas: "+quantidadeHora);
		System.out.println("Área do quadrado em centímetros: "+valorHora);
		System.out.println("Salário mensal R$: "+salario);
		
	}

}
