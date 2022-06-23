package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabela de pre�o - Verdur�o:");		
		System.out.println("Escolha o tipo de carne que deseja comprar: ");
		System.out.println("1 - File Duplo ");
		System.out.println("2 - Alcatra ");
		System.out.println("3 - Picanha ");		
		int tipoCarne=scan.nextInt();				
		
		double precoCarne=0;		
		double valorTotal=0;		
		double subtotal=0;
		double desconto=0;
		double quantidade=0;
		int tipoPagamento=0;
		
		//aqui faz verifica��o, se o tipo de carne informado � v�lido
		if(tipoCarne ==1 || tipoCarne ==2 ||tipoCarne ==3) {
			System.out.println("Informe a quantidade de carne em kilos(Kg):");
			quantidade = scan.nextDouble();	
			
			//aqui verifica se a quantidade � v�lida
			if(quantidade >0) {
				System.out.println("Informe o tipo de pagamento: ");
				System.out.println("1 - Dinheiro ");
				System.out.println("2 - Cart�o de cr�dito ");
				System.out.println("3 - Cheque ");		
				tipoPagamento=scan.nextInt();
				
				//aqui faz segunda verifica��o, se o tipo de pagamento informado � v�lido
				if(tipoPagamento==1||tipoPagamento==2) {					
					if(quantidade >0 && quantidade <=5) {					
						if(tipoCarne ==1) {		
							precoCarne = 4.9; 	
						}else if(tipoCarne ==2) {
							precoCarne = 5.9; 
						}else {
							precoCarne = 6.9; 	
						}						
					}else if(quantidade >5) {	
						if(tipoCarne ==1 ) {		
							precoCarne = 5.8; 
						}else if(tipoCarne ==2) {
							precoCarne = 6.80; 							
						}else {
							precoCarne = 7.80; 	
						}						
					}else {
						System.out.println("Quantidade inv�lida, informe novamente!!!");
					}					
					
					subtotal= precoCarne * quantidade;
					System.out.println("Nota Fiscal do Cliente: Fulano de tal");
					System.out.println("Produto  |Quantidade|Pre�o Unit�rio|Valor Total");				
					System.out.println("Picanha  |"+quantidade+"|"+precoCarne+"|"+subtotal);	
					System.out.println("Valor total da compra em R$: "+subtotal);
					
					if(tipoPagamento==1) {	
						desconto = (subtotal*5)/100;
						valorTotal = (subtotal-desconto);						
						System.out.println("Forma de pagamento: 1 -Dinheiro");
						System.out.println("Teve desconto de 5% no valor de R$: "+desconto);
						System.out.println("Valor total pago com desconto em R$: "+valorTotal);
					}else {							
						System.out.println("Forma de pagamento: 2 - Outros(Cart�o - cheque)");
						System.out.println("Valor total da compra em R$: "+subtotal);					
					}
					
				}else {
					System.out.println("Tipo de pagamento inv�lido, informe novamente!!!");
				}
			
			}else {
				System.out.println("Quantidade inv�lida, informe novamente!!!");
			}
			
		}else {
			System.out.println("Tipo de carne inv�lido, informe novamente!!!");
		}
			
	}

}
