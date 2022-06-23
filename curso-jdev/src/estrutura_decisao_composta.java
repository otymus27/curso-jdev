package modulo_01;

public class estrutura_decisao_composta {
	public static void main(String[] args) {
		
		int idade = 18;
		char sexo = 'M';
		
		
		
		//vai imprimir no console
		if (idade >=15) {
			if (idade>=15 && idade <18) {
				System.out.println("De menor.");
			}else {
				System.out.println("Apto a servir o exército.");
				if (idade==18) {
					System.out.println("Idade certa para se alistar!!");
				}
			}			 
			
		}else {
			System.out.println("Não pode servir o exército.");
		}
		
		
		
	}

}
