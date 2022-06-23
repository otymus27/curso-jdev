package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_53 {

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
		String saida;
		boolean resposta=false;
		
		
		do {
			System.out.println("Informe a temperatura desejada:");
			temperatura=scan.nextDouble();
			
			System.out.println("Temperatura "+cont+": "+temperatura+"º");
			
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
			
			//bloco para forçar o usuario a entrar com outro dado ou sair do programa
			System.out.println("Deseja cadastrar outra temperatura:");
			System.out.println("S - SIM    N -NÃO");
			saida = scan.next();			
			if(saida.equalsIgnoreCase("s")) {
				resposta = false;
			}else {
				resposta = true;
			}
						
			totalTemperatura +=temperatura;
			cont++;			
			
		}while(resposta==false);		
		cont--;
		
		media=totalTemperatura/cont;
				
		System.out.println();
		System.out.println("Departamento Estadual de Meteorologia - DEMET ");
		System.out.println("Resumo:");
		System.out.println("Total de temperaturas informadas: "+cont);
		System.out.println("Temperatura máxima: "+tempMaior);
		System.out.println("Temperatura mínima: "+tempMenor);
		System.out.println("Média das temperaturas: "+media);
			
	}

}
