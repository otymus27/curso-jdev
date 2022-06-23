package aula_13_exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça o tamanho de um arquivo para download
		(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
		informe o tempo aproximado de download do arquivo usando este link
		(em minutos).
		 * 
		*/
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB):");
		double tamanho = scan.nextDouble();
		
		System.out.println("Informe a velocidade de sua internet Mbps):");
		double velocidade = scan.nextDouble();
									
		double tempo = tamanho/velocidade;
		
		System.out.println("Calculo de banda larga - v1");
		System.out.println("Tamanho do arquivo em (MB): "+tamanho);
		System.out.println("Velocidade do link em Mbps: "+velocidade);
		System.out.println("Tempo estimado do download: "+tempo);		
		
	}

}
