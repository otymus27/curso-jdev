package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de preço:");	
		
		System.out.println("Escolha o combustível que deseja abastecer: A - ALCOOL , G - GASOLINA");
		//int tipoCombustivel=scan.nextInt();
		String tipoCombustivel = scan.next();		
				
		double valorAlcool = 1.90;
		double valorGasolina = 2.50;
		double valorCompra;
		double precoFinal;
		double desconto;
		
		//aqui valida o tipo de combustivel
		if(tipoCombustivel.equalsIgnoreCase("A")|| tipoCombustivel.equalsIgnoreCase("G")) {
			System.out.println("Informe a quantidade de combustível em Litros:");
			double quantidade = scan.nextDouble();
			//aqui valida quantidade de combustivel
			if(quantidade >0) {
				System.out.println("Nota Fiscal do Cliente: Fulano de tal");
				if(tipoCombustivel.equalsIgnoreCase("a")) {
					System.out.println("Produto: "+tipoCombustivel.toUpperCase()+"-Álcool");//metodo toUpperCase caractere fica sempre maiscula
				}else {
					System.out.println("Produto: "+tipoCombustivel.toUpperCase()+"-Gasolina");//metodo toUpperCase caractere fica sempre maiscula
				}
				
				System.out.println("Quantidade em (litros): "+quantidade);
				System.out.println("Preço do produto em R$: "+valorAlcool);
				
				if(tipoCombustivel.equalsIgnoreCase("a") && quantidade <=20) {
					valorCompra=quantidade * valorAlcool;
					desconto = (valorCompra*3)/100;
					precoFinal = valorCompra - desconto;					
					System.out.println("Teve desconto de 3% no valor de R$: "+desconto);
					System.out.println("Valor total pago em R$: "+precoFinal);
				}else if(tipoCombustivel.equalsIgnoreCase("a") && quantidade >20) {
					valorCompra=quantidade * valorAlcool;
					desconto = (valorCompra*5)/100;
					precoFinal = valorCompra - desconto;					
					System.out.println("Teve desconto de 5% no valor de R$: "+desconto);
					System.out.println("Valor total pago em R$: "+precoFinal);
				}else if(tipoCombustivel.equalsIgnoreCase("G") && quantidade <=20) {
					valorCompra=quantidade * valorGasolina;
					desconto = (valorCompra*4)/100;
					precoFinal = valorCompra - desconto;					
					System.out.println("Teve desconto de 4% no valor de R$: "+desconto);
					System.out.println("Valor total pago em R$: "+precoFinal);
				}else if(tipoCombustivel.equalsIgnoreCase("G") && quantidade >20) {
					valorCompra=quantidade * valorGasolina;
					desconto = (valorCompra*6)/100;
					precoFinal = valorCompra - desconto;					
					System.out.println("Teve desconto de 6% no valor de R$: "+desconto);
					System.out.println("Valor total pago em R$: "+precoFinal);
				}
			}else {
				System.out.println("Quantidade tem que ser maior que zero, informe novamente!!!");
			}				
			
		}else {
			System.out.println("Tipo de combustível inválido, informe novamente. A - ALCOOL , G - GASOLINA");
		}
		
	}
}
