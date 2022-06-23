package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_32 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando o total de um pedido baseado em uma tabela:");
			
		int cont=0;		
		int codigo=101;
		int valorItem=0;
		int valorTotal=0;
		int quantidade=0;		
		
		do {			
			
			System.out.println("Informe o código do produto: ");
			codigo=scan.nextInt();
			
			if(codigo !=0) {
				System.out.println("Informe a quantidade do produto: ");
				quantidade=scan.nextInt();
				
				if(codigo==100) {
					valorItem = (int) (quantidade * (1.2));
					System.out.println(quantidade+ "- Cachorro Quente "+codigo+" = R$ "+valorItem);
				}else if(codigo==101){
					valorItem = (int) (quantidade * (1.3));
					System.out.println(quantidade+ "- Bauru Simples "+codigo+" = R$ "+valorItem);
				}else if(codigo==102) {
					valorItem = (int) (quantidade * (1.5));
					System.out.println(quantidade+ "- Bauru com ovo "+codigo+" = R$ "+valorItem);
				}else if(codigo==103) {
					valorItem = (int) (quantidade * (1.2));
					System.out.println(quantidade+ "- Hamburguer "+codigo+" = R$ "+valorItem);
				}else if(codigo==104) {
					valorItem = (int) (quantidade * (1.3));
					System.out.println(quantidade+ "- Cheeseburguer "+codigo+" = R$ "+valorItem);
				}else if(codigo==105) {
					valorItem = (int) (quantidade * (1.0));
					System.out.println(quantidade+ "- Refrigerante "+codigo+" = R$ "+valorItem);
				}else {
					//valorItem = (int) (quantidade * (1.5));
					System.out.println("codigo invalido");
				}
				valorTotal +=valorItem;
				cont++;	
			}						
						
		} while (codigo !=0);			
		
		System.out.println("Resumo de sua compra: ");
		System.out.println("Total de itens: "+cont);
		System.out.println("Total da compra R$: "+valorTotal);
			
	}

}
