package aula_15;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Esta��o do ano:");
		System.out.println("1 - Ver�o, 2 - Primavera, 3 - Inverno, 4 - Outono");
		System.out.println("Informe um n�mero como op��o:");
		int estacao = scan.nextInt();			
								
		System.out.println("Estrutura Switch Case - encadeamento de v�rios blocos de comandos e s�o executados independente do resultado:");	
		System.out.println("Esta��es do ano:");
		switch (estacao) {		
			case 1: 			
				System.out.println("Voc� est� no ver�o.");
				break;
			case 2:
				System.out.println("Voc� est� na primavera.");
				break;
			case 3:
				System.out.println("Voc� est� no inverno.");
				break;
			case 4:
				System.out.println("Voc� est� no outono.");	
				break;			
			default:			
				System.out.println("Esta��o inv�lida!!!.");	
				break;			
		}
		
	}

}
