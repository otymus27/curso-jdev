package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de preço - Verdurão:");			
			
		System.out.println("Informe a quantidade de maças em kilos(Kg):");
		double quantidadeMaca = scan.nextDouble();
		
		System.out.println("Informe a quantidade de morangos em kilos(Kg):");
		double quantidadeMorango = scan.nextDouble();
		
		double precoMaca=0;
		double precoMorango=0;
		double valorTotal=0;
		double precoFinal=0;
		double desconto=0;
		double valorCompraMorango=0;
		double valorCompraMaca=0;
		double quantidadeTotal=0;
		
		//valida a quantidade de produtos
		if(quantidadeMaca >0 || quantidadeMorango >=0) {
			quantidadeTotal = quantidadeMaca+quantidadeMorango;				
			
			if(quantidadeMaca <=5 && quantidadeMorango <=5) {
				precoMaca = 1.8; 
				precoMorango = 2.5; 
				valorCompraMaca=(quantidadeMaca * precoMaca);
				valorCompraMorango = (quantidadeMorango *precoMorango);				
				precoFinal= valorCompraMaca+valorCompraMorango;						
			}else if(quantidadeMaca >5 && quantidadeMorango >5) {
				precoMaca = 1.5; 
				precoMorango = 2.2; 
				valorCompraMaca=(quantidadeMaca * precoMaca);
				valorCompraMorango = (quantidadeMorango *precoMorango);				
				precoFinal= valorCompraMaca+valorCompraMorango;		
			}else if(quantidadeMaca <=5 && quantidadeMorango >5) {//5 6
				precoMaca = 1.8; 
				precoMorango = 2.2; 
				valorCompraMaca=(quantidadeMaca * precoMaca);
				valorCompraMorango = (quantidadeMorango *precoMorango);				
				precoFinal= valorCompraMaca+valorCompraMorango;	
			}else if(quantidadeMaca >5 && quantidadeMorango <=5) {//6 e 5
				precoMaca = 1.5; 
				precoMorango = 2.2; 
				valorCompraMaca=(quantidadeMaca * precoMaca);
				valorCompraMorango = (quantidadeMorango *precoMorango);				
				precoFinal= valorCompraMaca+valorCompraMorango;					
			}
			
			System.out.println("Nota Fiscal do Cliente: Fulano de tal");
			System.out.println("Produto   |Quantidade|Preço Unitário|Valor Total");
			System.out.println("Maça      |"+quantidadeMaca+"|"+precoMaca+"|"+valorCompraMaca);
			System.out.println("Morango   |"+quantidadeMorango+"|"+precoMorango+"|"+valorCompraMorango);	
			System.out.println("Valor total da compra em R$: "+precoFinal);	
			
			if(precoFinal >=25 || quantidadeTotal >8) {
				desconto = (precoFinal*10)/100;
				valorTotal = precoFinal -desconto;	
				System.out.println("Teve desconto de 10% no valor de R$: "+desconto);
				System.out.println("Valor total pago com desconto em R$: "+valorTotal);
			}			
			
		}else {
			System.out.println("Informe pelo a quantidade de pelo menos um produto!!!");
		}		
				
	}
}
