package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando idade e classificando N pessoas:");		
				
		System.out.println("Informe a quantidade de pessoas que deseja classificar ?");
		int quantidadePessoas = scan.nextInt();
		
		int cont=1;
		double soma=0;
		double media;	
		
		while(cont <=quantidadePessoas){
			System.out.println("Informe a idade da "+cont+"� pessoa:");
			int idade = scan.nextInt();
			
			System.out.println("Idade "+cont+" = "+idade);			
			soma=soma + idade;
			cont++;
		}
		cont--;			
		media=soma/cont;
		
		System.out.println("Classifica��o et�ria de turma");
		System.out.println("Foram informadas "+(cont)+" idades.");		
		
		if(media <=25) {
			System.out.println("A m�dia de idade �: "+media+" - Turma Jovem");
		}else if(media >26 && media <=60){
			System.out.println("A m�dia de idade �: "+media+" - Turma Adulta");
		}else {
			System.out.println("A m�dia de idade �: "+media+" - Turma Idosa");
		}
		
		
	}

}
