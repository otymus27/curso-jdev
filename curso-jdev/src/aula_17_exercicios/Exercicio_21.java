package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando média de alunos por turma:");		
				
		System.out.println("Informe a quantidade de turmas que deseja classificar ?");
		int quantidadeTurmas = scan.nextInt();
		
		int cont=1;
		double soma=0;
		double media;	
		
		while(cont <=quantidadeTurmas){
			System.out.println("Informe a quantidade de alunos da "+cont+"ª turma:");
			int quantidadeAluno = scan.nextInt();
			
			if(quantidadeAluno <=40) {
				System.out.println("Quantidade de alunos "+cont+" = "+quantidadeAluno);			
				soma=soma + quantidadeAluno;
				cont++;
			}else {
				System.out.println("Turma com mais de 40 alunos, informe novamente!!!.");
			}			
		}
		cont--;			
		media=soma/cont;
				
		System.out.println("Média de alunos por turma");
		System.out.println("Foram informados "+(cont)+" turmas.");	
		System.out.println("A média de alunos é: "+media+" por turma.");
		
	}

}
