package aula_11;

public class TiposPrimitivos {

	public static void main(String[] args) {
		String nome = "Fábio";
		
		byte largura = 5;
		short comprimento = 500;
		int idade=40;
		long conta = 100000;
		
		float salario = 80.50f;//tamanho de 32 bits
		double peso = 75.50;//tamanho de 64 bits
		
		char sexo = 'M';//apenas um caracter, pode ser um inteiro
		
		boolean temFilhos=true;
				
		System.out.println("Nesta aula aprenderemos um sobre tipos primitivos de variáveis no java.");
		System.out.println("Exemplos de variáveis primitivas:");
		System.out.println("Variável tipo String: "+nome);
		System.out.println("Varíavel tipo char: "+sexo);
		System.out.println("Varíavel tipo byte: "+largura);
		System.out.println("Varíavel tipo short: "+comprimento);
		System.out.println("Varíavel tipo int: "+idade);
		System.out.println("Varíavel tipo long: "+conta);
		System.out.println("Varíavel tipo float: "+salario);
		System.out.println("Varíavel tipo double: "+peso);
		System.out.println("variável tipo boolean: "+temFilhos);
		
		/*Tipos de Variáveis primitivas do java:
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
