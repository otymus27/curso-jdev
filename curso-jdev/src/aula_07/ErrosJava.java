package aula_07;

public class ErrosJava {

	public static void main(String[] args) {
		//int variavelTeste;//aqui ocorre erro de sem�ntica, pois a vari�vel nao foi usada
		
		System.out.println("Nesta aula aprenderemos um pouco sobre erros no java.");
		System.out.println("Erro de Sintaxe:");//aqui vai ocorrer erro de sintaxe
		//System.out.println("Voce informou:"+variavelTeste);//aqui ocorre erro de sem�ntica, pois a vari�vel nao foi inicializada
		System.out.println("1/0 Vai dar erro em Tempo de Execu��o:"+1/0);//aqui vai ocorrer erro em Tempo de Execu��o
		
		/*03 Tipos de erros que pode acontecer:
		 * 
		 * Erros de Sintaxe - ex:algum comando que foi digitado errado ou alguma parte faltando
		 * tipo no final do comando, falta de ponto e virgula.
		 * Erros de Sem�ntica - ex: uma vari�vel que foi declarada e n�o foi inicializada.
		 * Erros em Tempo de Execu��o - ex: fiz uma classe e n�o foi declarado 
		 * m�todo main.
		 * */

	}

}
