package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora trabalhada em R$:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas:");
		double quantidadeHora = scan.nextDouble();
						
		double salarioBruto = valorHora*quantidadeHora;
		double percentual;
		
		
		System.out.println("Folha de pagamento - v2");
		
		if(salarioBruto <=900) {
			percentual=0;
		}else if(salarioBruto >900 && salarioBruto <=1500){
			percentual=5;
		}else if(salarioBruto >1500 &&salarioBruto <=2500) {
			percentual=10;
		}else {
			percentual=20;
		}
		
		double inss = ((10*salarioBruto)/100);
		double sindicato = ((3*salarioBruto)/100);		
		double descontos = inss + sindicato;
		double salarioLiquido = salarioBruto - descontos;
		double fgts = ((11*salarioBruto)/100);
		double impostoRenda = ((percentual*salarioBruto)/100);
		
		
		System.out.println("Quantidade de horas trabalhadas: "+quantidadeHora);
		System.out.println("Valor da hora trabalhada 	R$: "+valorHora);
		System.out.println("Salário Bruto				R$: "+salarioBruto);
		System.out.println("IRPF 						R$: "+impostoRenda);
		System.out.println("INSS 						R$: "+inss);
		System.out.println("Sindicato 					R$: "+sindicato);
		System.out.println("Total de descontos 			R$: "+descontos);
		System.out.println("Salário líquido mensal 		R$: "+salarioLiquido);
		System.out.println("FGTS do mês 				R$: "+fgts);
		
	}
}
