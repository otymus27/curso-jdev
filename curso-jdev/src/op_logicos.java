package modulo_01;

public class op_logicos {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 10;
		int n3 = 5;
		int media = (n1+n2+n3)/3;
	
		System.out.println("Calculando a média de um aluno:");
		
		if (media >=7) {		
			System.out.println("APROVADO!!!");
			System.out.println("Média = " + media);
			
			if(media>=5 && media <7) {
				System.out.println("EM RECUPERAÇÃO!!!");
				System.out.println("Média = " + media);
			}
			
		}else {
			System.out.println("REPROVADO!!");
			System.out.println("Média = " + media);
		}			
		
		
	}

}
