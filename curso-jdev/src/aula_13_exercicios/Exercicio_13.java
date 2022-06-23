package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		o salário bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o salário líquido.
		d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		
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
		System.out.println("Salário Bruto R$: "+salarioBruto);
		System.out.println("IRPF R$: "+impostoRenda);
		System.out.println("INSS R$: "+inss);
		System.out.println("Sindicato R$: "+sindicato);
		System.out.println("Total de descontos R$: "+descontos);
		System.out.println("Salário líquido mensal R$: "+salarioLiquido);
		
	}

}
