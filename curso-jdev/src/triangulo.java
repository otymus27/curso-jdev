package modulo_01;

public class triangulo {
	public static void main(String[] a) {
		int comprimento = 15;
		int largura = 5;
		int perimetro = (2*comprimento) + (2*largura);
		int area = comprimento * largura ;
		
		
		//vai imprimir no console
		System.out.println("Calculando a �rea e perimetro de um ret�ngulo:");
		System.out.println("Perimetro = " + perimetro);
		System.out.println("�rea = "+ area);
	}

}
