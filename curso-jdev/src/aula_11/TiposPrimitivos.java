package aula_11;

public class TiposPrimitivos {

	public static void main(String[] args) {
		String nome = "F�bio";
		
		byte largura = 5;
		short comprimento = 500;
		int idade=40;
		long conta = 100000;
		
		float salario = 80.50f;//tamanho de 32 bits
		double peso = 75.50;//tamanho de 64 bits
		
		char sexo = 'M';//apenas um caracter, pode ser um inteiro
		
		boolean temFilhos=true;
				
		System.out.println("Nesta aula aprenderemos um sobre tipos primitivos de vari�veis no java.");
		System.out.println("Exemplos de vari�veis primitivas:");
		System.out.println("Vari�vel tipo String: "+nome);
		System.out.println("Var�avel tipo char: "+sexo);
		System.out.println("Var�avel tipo byte: "+largura);
		System.out.println("Var�avel tipo short: "+comprimento);
		System.out.println("Var�avel tipo int: "+idade);
		System.out.println("Var�avel tipo long: "+conta);
		System.out.println("Var�avel tipo float: "+salario);
		System.out.println("Var�avel tipo double: "+peso);
		System.out.println("vari�vel tipo boolean: "+temFilhos);
		
		/*Tipos de Vari�veis primitivas do java:
		 * 
		 * Tipos Inteiros
		 * Tipos Ponto Flutuante 
		 * Tipo Char
		 * Tipo Boolean
		 * Literais
		 * 
		 * */

	}

}
