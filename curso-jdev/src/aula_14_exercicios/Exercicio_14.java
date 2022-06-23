package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota do primeiro bimestre:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota do segundo bimestre:");
		double nota2 = scan.nextDouble();
						
		double media = (nota1+nota2)/2;
		
		
		System.out.println("Boletim Escolar - v1");
		
		if((nota1 >=0 && nota1 <=10) && (nota2>=0 && nota2 <=10)) {
			if(media >9 && media <= 10) {
				System.out.println("O aluno ficou com média igual a:  "+media+" -  APROVADO!!!");
				System.out.println("Conceito final: A");
			}else if(media > 7.5 && media <=9) {
				System.out.println("O aluno ficou com média igual a:  "+media+" -  APROVADO!!!");
				System.out.println("Conceito final: B");
			}else if(media > 6 && media <=7.5) {
				System.out.println("O aluno ficou com média igual a:  "+media+" -  APROVADO!!!");
				System.out.println("Conceito final: C");
			}else if(media > 4 && media <=6) {
				System.out.println("O aluno ficou com média igual a: "+media+" - RECUPERAÇÃO!!!");
				System.out.println("Conceito final: D");
			}else {
				System.out.println("O aluno ficou com média igual a: "+media+" - REPROVADO!!!");
				System.out.println("Conceito final: E");
			}
		}else {
			System.out.println("Notas inválidas, informe novamente!!!");
			System.out.println("Informe valores entre 0 - 10");
		}
			
			
		
	}

}
