package aula_17_exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
					
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//usando String como entrada de dados
		System.out.println("Informe o seu login:");		
		String login = scan.next();
		
		System.out.println("Informe a sua senha:");
		String senha = scan.next();
		
		while(login.equalsIgnoreCase(senha)) {
			System.out.println("A senha não pode ser igual ao login, informe novamente!!!");
			System.out.println("Informe a sua senha:");
			senha = scan.next();
		}
				
		System.out.println("Sistema de login:");
		System.out.println("O usuário "+login+" pode acessar o sistema!!!");
			

	}

}
