package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o
		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
		sal�rio no referido m�s.
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
		System.out.println("�rea do quadrado em cent�metros: "+valorHora);
		System.out.println("Sal�rio mensal R$: "+salario);
		
	}

}
