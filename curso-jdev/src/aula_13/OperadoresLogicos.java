package aula_13;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int idade = 18;
		char sexo = 'M';
				
								
		System.out.println("Operadores lógicos:");	
		if(idade >=18 && sexo =='M') {
			boolean resultado = (idade >=18 && sexo =='M');
			System.out.println(resultado);
			System.out.println("Foi usado operador lógico - AND(&&)");			
		}
		
		if(idade >=18 || sexo =='F') {
			boolean resultado = (!(sexo=='M'));
			System.out.println(resultado);
			System.out.println("Foi usado operador lógico - OR(||)");			
		}
		
		if(idade>=18 || !(sexo=='F')) {
			boolean resultado = (idade>=18 || !(sexo=='M'));
			System.out.println(resultado);
			System.out.println("Foi usado operador lógico - NEGAÇÃO(!)");			
		}
		
		
		
		
	}

}
