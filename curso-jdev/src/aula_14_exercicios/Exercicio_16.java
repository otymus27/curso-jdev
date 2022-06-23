package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de A:");
		int a = scan.nextInt();		
				
		System.out.println("Equação do 2º Grau:");
		
		if(a != 0) {			
			
			System.out.println("Informe o valor de B:");
			int b = scan.nextInt();
			
			System.out.println("Informe o valor de C:");
			int c = scan.nextInt();
			
			if(b!=0 &&c!=0) {				
				
				double delta = (Math.pow(b, 2) - 4*a*c);				
				double x1;
				double x2;
				
				if(delta > 0) {
					x1=(-b+Math.sqrt(delta))/(2*a);
					x2=(-b-Math.sqrt(delta))/(2*a);
					
					System.out.println("Valor de delta: "+delta);
					if(a>1 && b>1 && c<0) {//2x+2x-1	ok				
						System.out.println("Para equação "+a+"x²+"+b+"x"+c+"  existem 02 raízes reais:");						
					}else if(a>1 && b==-1 && c<0) {//2x²-x-1 ok
						System.out.println("Para equação "+a+"x²-x"+c+" - existem 02 raízes reais:");						
					}else if(a>1 && b==1 && c<0) {//2x+x-1 ok
						System.out.println("Para equação "+a+"x²+x"+c+" - existemxxx 02 raízes reais:");									
					}else if(a==-1 && b==1 && c>0){//-x²+x+1 ok
						System.out.println("Para equação -x²+x+"+c+" existem 02 raízes reais:");						
					}else if(a<-1 && b==-1 && c>0) {//-2x²-x+1 ok
						System.out.println("Para equação "+a+"x²"+b+"x+"+c+" existem 02 raízes reais:");						
					}else if(a<-1 && b<-1 && c>0) {//-2x²-2x+1 ok
						System.out.println("Para equação "+a+"x²"+b+"x+"+c+" existem 02 raízes reais:");						
					}else if(a<-1 && b==1 && c>0) {//-2x²+x+1 ok
						System.out.println("Para equação "+a+"x²+x+"+c+"  existem 02 raízes reais:");						
					}else if(a<-1 && b>1 && c>0) {//-2x²+2x+1 ok
						System.out.println("Para equação "+a+"x²+"+b+"x+"+c+" existem 02 raízes reais:");							
					}else if(a>1 && b<-1 && c<0) {//2x²-2x-1 ok
						System.out.println("Para equação "+a+"x²"+b+"x"+c+" - existem 02 raízes reais:");						
					}else if(a==1 && b<-1 && c<0) {//x²-2x-1 ok
						System.out.println("Para equação x²"+b+"x"+c+" - existem 02 raízes reais:");						
					}else if(a==1 && b>1 && c<0) {//x²+2x-1 ok
						System.out.println("Para equação x²+"+b+"x"+c+"  existem 02 raízes reais:");						
					}else if(a==-1 && b>1 && c>0) {//-x²+2x+1 ok
						System.out.println("Para equação -x²+"+b+"x+"+c+"  existem 02 raízes reais:");						
					}else if(a==-1 && b==-1 && c>0) {//-x²-x+1 ok
						System.out.println("Para equação -x²+x+"+c+"  existem 02 raízes reais:");						
					}else if(a==1 && b==-1 && c<0) {//x²-x-1 ok
						System.out.println("Para equação x²-x"+c+"  existem 02 raízes reais:");						
					}else if(a==1 && b==1 && c<0){//x²+x-1 ok
						System.out.println("Para equação x²+x"+c+" existem 02 raízes reais:");							
					}else if(a>1 && b<-1 && c>0) {//2x²-2x+1 ok
						System.out.println("Para equação "+a+"x²"+b+"x+"+c+" existem 02 raízes reais:");						
					}else if(a>1 && b>1 && c>0) {//2x+2x+1	ok
						System.out.println("Para equação "+a+"x²+"+b+"x+"+c+" existem 02 raízes reais:");						
					}else {
						System.out.println("Para equação x²+"+b+"x+"+c+" existem 02 raízes reais:");						
					}
					
					System.out.println("Valor de raiz x1 = "+x1);
					System.out.println("Valor de raiz x2 = "+x2);
					
				}else if(delta < 0) {				
					System.out.println("Valor de delta: "+delta);
					if(a==-1 && b==-1 && c<0 ) {//-x²-x-1 ok
						System.out.println("Para equação -x²-x"+c+" não existem raízes reais:");					
					}else if(a==-1 && b<-1 && c<0) {//-x-2x-1 ok
						System.out.println("Para equação -x²"+b+"x"+c+" - não existem raízes reais:");						
					}else if(a<0 && b==-1 && c<0) {//-2x-x-1
						System.out.println("Para equação "+a+"x²-x"+c+" - não existem raízes reais:");	
					}else if(a>1 && b>1 && c>0) {//2x+2x+1	ok
						System.out.println("Para equação "+a+"x²+"+b+"x+"+c+" - não existem raízes reais:");						
					}else if(a==1 && b==1 && c>0){//x²+x+1
						System.out.println("Para equação "+a+"x²+"+b+"x+"+c+" - não existem raízes reais:");				
					}else if(a==-1 && b==1 && c<0){//-x²+x-1 ok
						System.out.println("Para equação -x²+x"+c+" não existem raízes reais:");					
					}else if(a>1 && b<-1 && c>0) {//2x²-2x+1 ok
						System.out.println("Para equação "+a+"x²"+b+"x+"+c+" não existem raízes reais:");					
					}else if(a==1 && b>1 && c>0) {//x+2x+1	ok
						System.out.println("Para equação x²+"+b+"x+"+c+" não existem raízes reais:");						
					}else if(a<-1 && b<-1 && c<0) {//-2x-2x-1 ok
						System.out.println("Para equação "+a+"x²"+b+"x"+c+" - não existem raízes reais:");						
					}else if(a==1 && b==-1 && c>0){//x²-x+1
						System.out.println("Para equação x²-x+"+c+" não existem raízes reais:");				
					}else if(a<-1 && b>-1 && c<0){//-2x²+2x-1						
						System.out.println("Para equação "+a+"x²+"+b+"x"+c+" não existem raízes reais:");				
					}else {//2x+x+1						
						System.out.println("Para equação "+a+"x²+x+"+c+" não existem raízes reais:");				
					}
					
				}else {					
					x1=(-b+Math.sqrt(delta))/(2*a);			
					System.out.println("Para equação "+a+"x²"+b+"x+"+c+" as raízes reais são iguais:");				
					System.out.println("Valor de delta: "+delta);
					System.out.println("Raízes reais iguais");
					System.out.println("Valor das raízes é = "+x1);				
				}	
				
			}else {
				System.out.println("Valor de B=0 ou C=0, não forma equação completa do 2º grau!!!");
				System.out.println("Informe valores diferentes de zero!!!");
			}			
			
		}else {			
			System.out.println("Valor de A = 0, não forma equação do 2º grau!!!");
			System.out.println("Informe valores diferentes de zero!!!");
		}
		
	}

}
