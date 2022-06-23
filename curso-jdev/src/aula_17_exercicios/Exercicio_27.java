package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_27 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Comparação de temperaturas:");
		
		double temperatura;
		double totalTemperatura=0;
		double media;
		int cont=1;
		double tempMaior=0;
		double tempMenor=0;
		String saida="";
				
		System.out.println("Informe a quantidade de temperaturas desejadas:");
		int quantidade=scan.nextInt();
				
		do {
			System.out.println("Informe a "+cont+"ª temperatura desejada:");
			temperatura=scan.nextDouble();
			
			//pega a maior temperatura dentro do conjunto informado
			if(temperatura >=tempMaior) {
				tempMaior=temperatura;
				if(cont==1) {
					tempMenor=temperatura;
				}
			}
			
			//pega a menor temperatura dentro do conjunto informado
			if(temperatura < tempMaior ) {
				tempMenor=temperatura;
			}	
						
			totalTemperatura +=temperatura;
			saida += cont+"ª temperatura: "+temperatura+"\n";
			cont++;	
			
		}while(cont <=quantidade);		
		cont--;
		
		media=totalTemperatura/cont;
				
		System.out.println();
		System.out.println("Departamento Estadual de Meteorologia - DEMET ");
		System.out.println("Resumo:");
		System.out.println("Temperaturas informadas: \n"+saida);
		System.out.println("Total de temperaturas informadas: "+cont);
		System.out.println("Temperatura máxima: "+tempMaior);
		System.out.println("Temperatura mínima: "+tempMenor);
		System.out.println("Média das temperaturas: "+media);
			
	}

}
