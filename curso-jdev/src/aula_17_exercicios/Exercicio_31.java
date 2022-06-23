package aula_17_exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_31 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando aumento salarial gradativo:");
		System.out.println("Informe o sal�rio atual R$: ");
		double salarioAtual = scan.nextDouble();
		double percentual=1.5;		
		int anoAtual=2000;
		int anoInicial=1996;
		int cont=0;
		
		DecimalFormat formata=new DecimalFormat("###,###.##");//classe para saida formata de decimal
			
		System.out.println("Evolu��o salarial entre "+anoInicial+" e "+anoAtual);
		
		do {			
			
			if(cont==1) {
				salarioAtual +=(salarioAtual*percentual)/100;
				System.out.println("Sal�rio no ano de "+anoInicial+" = R$ "+formata.format(salarioAtual));
			}else if(cont >1) {
				percentual=percentual*2;
				salarioAtual +=(salarioAtual*percentual)/100;
				System.out.println("Sal�rio no ano de "+anoInicial+" = R$ "+formata.format(salarioAtual));
			}else {
				System.out.println("Sal�rio no ano de "+anoInicial+" = R$ "+formata.format(salarioAtual));
			}
			
			anoInicial++;
			cont++;	
						
		} while (anoInicial <=anoAtual);	
			
	}

}
