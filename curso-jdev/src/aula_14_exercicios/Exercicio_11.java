package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do sal�rio do funcion�rio em R$:");
		double salarioAtual = scan.nextDouble();
		
		System.out.println("Tabela de reajuste:");
		System.out.println("sal�rios at� R$ 280,00 (incluindo) - 20%");
		System.out.println("sal�rios entre R$ 700,00 e R$ 1500,00 - 10%");
		System.out.println("sal�rios entre R$ 280,00 e R$ 700,00 -  15%");
		System.out.println("sal�rios acima de R$ 1500 - 5%");	
				
		System.out.println("Folha de pagamento - v1");
		
		if(salarioAtual <=280) {
			double valorReajuste = (salarioAtual * 20)/100;
			double salarioReajustado = salarioAtual + valorReajuste;
			System.out.println("Sal�rio antes do reajuste R$: "+salarioAtual);
			System.out.println("O percentual do reajuste foi de: 20%");
			System.out.println("O valor do reajuste foi de R$: "+valorReajuste);
			System.out.println("Sal�rio apos reajuste � de R$: "+salarioReajustado);
		}else if(salarioAtual >280 && salarioAtual <=700) {
			double valorReajuste = (salarioAtual * 15)/100;
			double salarioReajustado = salarioAtual + valorReajuste;
			System.out.println("Sal�rio antes do reajuste R$: "+salarioAtual);
			System.out.println("O percentual do reajuste foi de: 15%");
			System.out.println("O valor do reajuste foi de R$: "+valorReajuste);
			System.out.println("Sal�rio apos reajuste � de R$: "+salarioReajustado);
		}else if(salarioAtual >700 && salarioAtual <=1500){
			double valorReajuste = (salarioAtual * 10)/100;
			double salarioReajustado = salarioAtual + valorReajuste;
			System.out.println("Sal�rio antes do reajuste R$: "+salarioAtual);
			System.out.println("O percentual do reajuste foi de: 10%");
			System.out.println("O valor do reajuste foi de R$: "+valorReajuste);
			System.out.println("Sal�rio apos reajuste � de R$: "+salarioReajustado);
		}else {
			double valorReajuste = (salarioAtual * 5)/100;
			double salarioReajustado = salarioAtual + valorReajuste;
			System.out.println("Sal�rio antes do reajuste R$: "+salarioAtual);
			System.out.println("O percentual do reajuste foi de: 5%");
			System.out.println("O valor do reajuste foi de R$: "+valorReajuste);
			System.out.println("Sal�rio apos reajuste � de R$: "+salarioReajustado);
		}
		
		
	}

}
