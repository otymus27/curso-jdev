package aula_16;

import java.util.Scanner;

public class RepeticaoFor {
	public static void main(String[] args) {
		/*		COMANDO FOR
		 * 
		 * - Executa um bloco de código que está dentro do comando FOR enquanto 
		 * uma expressão for verdadeira.
		 * - O mais utilizado na programação.
		 * 
		 * Sintaxe
		 * 
		 * for(inicialização;condição;atualização){
		 * 		alguma lógica de programação;
		 * }
		 * 
		 */		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade que deseja contar:");
		int quantidade = scan.nextInt();	
		int i; //contador 1
		int j ;//contador 2
			
		//comando for usando apenas uma variavel
		for(i=1;i <=quantidade; i++) {
			System.out.println("valor de i = "+i);
		}
		
		System.out.println("Imprimindo a quantidade que foi repetida = "+ i);
		
		//comando for usando 2 variaveis
		for(i=1, j=10; i<j;i++, j--) {
			System.out.println("valor de i = "+i+" j= "+j);			
		}
		
		for(int cont=0; cont <10; cont +=2) {
			System.out.println("valor de cont = "+cont);
		}
		
		int soma=0;
		for(i=1; i<5; soma += i++) {
			System.out.println("O valor da soma é "+soma);
		}
		
	}

}
