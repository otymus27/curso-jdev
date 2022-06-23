package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double nota2;			
		
		System.out.println("Informe a nota do primeiro bimestre:");
		double nota1 = scan.nextDouble();
		while((nota1 <0 || nota1 >10) ) {			
			System.out.println("Nota inválida, informe valores entre 0 e 10 !!!");
			System.out.println("Informe a nota do primeiro bimestre:");
			nota1 = scan.nextDouble();				
		}
		
		System.out.println("Informe a nota do segundo bimestre:");
		nota2 = scan.nextDouble();		
		while(nota2 <0 || nota2 >10) {
			System.out.println("Nota inválida, informe valores entre 0 e 10 !!!");
			System.out.println("Informe a nota do segundo bimestre:");
			nota2 = scan.nextDouble();
		}	
		
		double media = (nota1+nota2)/2;	
		
		System.out.println("Boletim Escolar - v1");
		if(media >=7 && media < 10) {
			System.out.println("O aluno ficou com média igual a:  "+media+" - APROVADO!!!");
		}else if(media < 7 && media >=5) {
			System.out.println("O aluno ficou com média igual a: "+media+" - RECUPERAÇÃO!!!");
		}else if(media ==10) {
			System.out.println("O aluno ficou com média igual a: "+media+" - APROVADO COM DISTINÇÃO!!!");
		}else {
			System.out.println("O aluno ficou com média igual a: "+media+" - REPROVADO!!!");
		}
		
	}

}
