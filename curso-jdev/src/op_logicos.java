package modulo_01;

public class op_logicos {
	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 10;
		int n3 = 5;
		int media = (n1+n2+n3)/3;
	
		System.out.println("Calculando a m�dia de um aluno:");
		
		if (media >=7) {		
			System.out.println("APROVADO!!!");
			System.out.println("M�dia = " + media);
			
			if(media>=5 && media <7) {
				System.out.println("EM RECUPERA��O!!!");
				System.out.println("M�dia = " + media);
			}
			
		}else {
			System.out.println("REPROVADO!!");
			System.out.println("M�dia = " + media);
		}			
		
		
	}

}
