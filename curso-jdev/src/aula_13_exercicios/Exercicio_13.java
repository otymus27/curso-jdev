package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
		 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
		Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
		o sal�rio bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o sal�rio l�quido.
		d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada em R$:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas:");
		double quantidadeHora = scan.nextDouble();
						
		double salarioBruto = valorHora*quantidadeHora;
		double impostoRenda = ((11*salarioBruto)/100);
		double inss = ((8*salarioBruto)/100);
		double sindicato = ((5*salarioBruto)/100);
		double descontos = impostoRenda + inss + sindicato;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Folha de pagamento - v2");
		System.out.println("Quantidade de horas trabalhadas: "+quantidadeHora);
		System.out.println("Valor da hora trabalahada R$: "+valorHora);
		System.out.println("Sal�rio Bruto R$: "+salarioBruto);
		System.out.println("IRPF R$: "+impostoRenda);
		System.out.println("INSS R$: "+inss);
		System.out.println("Sindicato R$: "+sindicato);
		System.out.println("Total de descontos R$: "+descontos);
		System.out.println("Sal�rio l�quido mensal R$: "+salarioLiquido);
		
	}

}
