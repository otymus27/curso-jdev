package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor do produto em R$:");
		double preco1 = scan.nextDouble();
		
		System.out.println("Informe o segundo valor do produto em R$:");
		double preco2 = scan.nextDouble();
		
		System.out.println("Informe o terceiro valor do produto em R$:");
		double preco3 = scan.nextDouble();
		
		if((preco1 < preco2) && (preco1 < preco3) && (preco1!=preco3)) {
			System.out.println("O menor pre�o informado foi o primeiro: "+preco1);
		}else if((preco2 < preco1) && (preco2 < preco3)&& (preco1!=preco3)) {
			System.out.println("O menor n�mero informado foi o segundo: "+preco2);
		}else if((preco3 < preco1) && (preco3 < preco2) && (preco1!=preco2)) {
			System.out.println("O menor pre�o informado foi o terceiro: "+preco3);
		}else {
			if((preco1 == preco2) && (preco1 == preco3)) {
				System.out.println("Todos valores s�o iguais: "+preco1);
			}else if((preco1 == preco3)&&(preco1>preco2)) {							
				System.out.println("O primeiro e o terceiro s�o iguais e os maiores.");
				System.out.println("Portanto o segundo n�mero informado � o menor.");
			}else if((preco1 == preco3)&&(preco1<preco2)) {		
				System.out.println("O primeiro e o terceiro s�o iguais e os menores.");				
			}else if((preco1 == preco2)&&(preco2>preco3)) {		
				System.out.println("O primeiro e o segundo s�o iguais e os maiores.");
				System.out.println("Portanto o terceiro n�mero informado � o menor.");
			}else if((preco1 == preco2)&&(preco2<preco3)) {	
				System.out.println("O primeiro e o segundo s�o iguais e os menores.");
			}else if((preco2 == preco3)&&(preco2>preco1)) {	
				System.out.println("O segundo e o terceiro s�o iguais e os maiores.");
				System.out.println("Portanto o primeiro n�mero informado � o menor.");
			}else {
				System.out.println("O segundo e o terceiro s�o iguais e os menores.");
			}
		}		
		
	}

}
