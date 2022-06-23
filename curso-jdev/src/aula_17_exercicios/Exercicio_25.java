package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de itens:");
		
		double precoItem;
		double valorCompra=0;
		double valorPago;
		double valorTotal=0;
		int cont=0;
		double troco;
		String saida="";
		int quantidade=0;
		
		do {
			System.out.println("Informe o preço do item ou digite '0'para sair:");
			precoItem=scan.nextDouble();
			
			if(precoItem >0) {
				System.out.println("Informe a quantidade do produto:");
				quantidade = scan.nextInt();
			}
			
			System.out.println("Produto "+cont+": R$ "+precoItem);
			valorCompra=precoItem * quantidade;
			valorTotal +=precoItem*quantidade;
			cont++;
			saida +="Produto "+cont+": R$ "+precoItem+"\n";
			
		}while(precoItem !=0);		
		
		System.out.println("Valor da sua compra é de R$: "+valorCompra);				
		System.out.println("Informe o valor em dinheiro:");
		valorPago=scan.nextDouble();
		troco=valorPago-valorCompra;
		
		System.out.println();
		System.out.println("Panificadora Pão de Ontem ");
		System.out.println("Resumo da Compra:");
		System.out.println(saida);
		System.out.println("Total de itens comprados: "+cont);
		System.out.println("Valor total da compra em R$: "+valorTotal);
		System.out.println("Valor pago em dinheiro R$: "+valorPago);
		System.out.println("Valor do troco em R$: "+troco);
			
		
	}

}
