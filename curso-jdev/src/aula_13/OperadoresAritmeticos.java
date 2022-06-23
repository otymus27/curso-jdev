package aula_13;

public class OperadoresAritmeticos {
	public static void main(String[] a) {
		int n1 = 15;
		int n2 = 10;
		String nome="Fábio ";
		String sobrenome = "Alencar Rocha";
				
		int soma = n1 + n2; 
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		int divisao = n1 / n2;
		
						
		System.out.println("Operadores aritméticos:");
		System.out.println("Soma de "+n1 +"+"+n2+"="+soma);
		System.out.println("Subtração de "+n1 +"-"+n2+"="+subtracao);
		System.out.println("Multiplicação de "+n1 +"*"+n2+"="+multiplicacao);
		System.out.println("Divisão de "+n1 +"/"+n2+"="+divisao);
		System.out.println("Resultado de mod "+n1 %2);
		System.out.println("Soma de Strings: "+nome + sobrenome);
		
		//incremento e decremento
		int resultado = 5;
		
		resultado++;
		//mesma coisa que => resultado = resultado + 1
		//mesma coisa que => resultado +=
		System.out.println(resultado +" - Aqui imprimiu e depois somou");
		
		resultado--;
		//mesma coisa que => resultado = resultado - 1
		//mesma coisa que => resultado -=
		System.out.println(resultado +" - Aqui imprimiu e depois subtraiu");
		 		
		resultado= 10;
		++resultado;
		//mesma coisa que => resultado = resultado - 1
		//mesma coisa que => resultado -=
		System.out.println(resultado +" - Aqui somou e depois imprimiu");
		
		--resultado;
		//mesma coisa que => resultado = resultado - 1
		//mesma coisa que => resultado -=
		System.out.println(resultado +" - Aqui subtraiu e depois imprimiu");
		
		
		
		
		
		
		
	}

}
