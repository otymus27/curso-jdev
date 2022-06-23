package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {				
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota do primeiro bimestre:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota do segundo bimestre:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		System.out.println("Boletim Escolar - v1");
		
		if((nota1 >=0 && nota1 <=10)  && (nota2 >=0 && nota2 <=10)) {
			if(media >=7 && media < 10) {
				System.out.println("O aluno ficou com média igual a:  "+media+" - APROVADO!!!");
			}else if(media < 7 && media >=5) {
				System.out.println("O aluno ficou com média igual a: "+media+" - RECUPERAÇÃO!!!");
			}else if(media ==10) {
				System.out.println("O aluno ficou com média igual a: "+media+" - APROVADO COM DISTINÇÃO!!!");
			}else {
				System.out.println("O aluno ficou com média igual a: "+media+" - REPROVADO!!!");
			}
		}else {
			System.out.println("Nota inválida, informe valores entre 0 e 10 !!!");
		}
		
		
		
		
	}

}
