package modulo_01;

public class estrutura_decisao {
	public static void main(String[] args) {
		
		int idade = 18;
		char sexo = 'M';
		
		//vai imprimir no console
		if ((idade >=18) && (sexo =='M')) {
			System.out.println("Apto a servir o ex�rcito.");
		}else {
			System.out.println("N�o pode servir o ex�rcito.");
		}
		
		if ((idade >=18) && (sexo !='F')) {
			System.out.println("Apto a servir o ex�rcito.");
		}else {
			System.out.println("N�o pode servir o ex�rcito.");
		}
		
		if ((idade >=18) || (sexo =='M')) {
			System.out.println("Apto a servir o ex�rcito.");
		}else {
			System.out.println("N�o pode servir o ex�rcito.");
		}
		
	}

}
