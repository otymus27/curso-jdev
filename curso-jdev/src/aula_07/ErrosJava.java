package aula_07;

public class ErrosJava {

	public static void main(String[] args) {
		//int variavelTeste;//aqui ocorre erro de semântica, pois a variável nao foi usada
		
		System.out.println("Nesta aula aprenderemos um pouco sobre erros no java.");
		System.out.println("Erro de Sintaxe:");//aqui vai ocorrer erro de sintaxe
		//System.out.println("Voce informou:"+variavelTeste);//aqui ocorre erro de semântica, pois a variável nao foi inicializada
		System.out.println("1/0 Vai dar erro em Tempo de Execução:"+1/0);//aqui vai ocorrer erro em Tempo de Execução
		
		/*03 Tipos de erros que pode acontecer:
		 * 
		 * Erros de Sintaxe - ex:algum comando que foi digitado errado ou alguma parte faltando
		 * tipo no final do comando, falta de ponto e virgula.
		 * Erros de Semântica - ex: uma variável que foi declarada e não foi inicializada.
		 * Erros em Tempo de Execução - ex: fiz uma classe e não foi declarado 
		 * método main.
		 * */

	}

}
