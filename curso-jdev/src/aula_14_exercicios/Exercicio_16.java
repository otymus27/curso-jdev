package aula_14_exercicios;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de A:");
		int a = scan.nextInt();		
				
		System.out.println("Equa��o do 2� Grau:");
		
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
						System.out.println("Para equa��o "+a+"x�+"+b+"x"+c+"  existem 02 ra�zes reais:");						
					}else if(a>1 && b==-1 && c<0) {//2x�-x-1 ok
						System.out.println("Para equa��o "+a+"x�-x"+c+" - existem 02 ra�zes reais:");						
					}else if(a>1 && b==1 && c<0) {//2x+x-1 ok
						System.out.println("Para equa��o "+a+"x�+x"+c+" - existemxxx 02 ra�zes reais:");									
					}else if(a==-1 && b==1 && c>0){//-x�+x+1 ok
						System.out.println("Para equa��o -x�+x+"+c+" existem 02 ra�zes reais:");						
					}else if(a<-1 && b==-1 && c>0) {//-2x�-x+1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x+"+c+" existem 02 ra�zes reais:");						
					}else if(a<-1 && b<-1 && c>0) {//-2x�-2x+1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x+"+c+" existem 02 ra�zes reais:");						
					}else if(a<-1 && b==1 && c>0) {//-2x�+x+1 ok
						System.out.println("Para equa��o "+a+"x�+x+"+c+"  existem 02 ra�zes reais:");						
					}else if(a<-1 && b>1 && c>0) {//-2x�+2x+1 ok
						System.out.println("Para equa��o "+a+"x�+"+b+"x+"+c+" existem 02 ra�zes reais:");							
					}else if(a>1 && b<-1 && c<0) {//2x�-2x-1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x"+c+" - existem 02 ra�zes reais:");						
					}else if(a==1 && b<-1 && c<0) {//x�-2x-1 ok
						System.out.println("Para equa��o x�"+b+"x"+c+" - existem 02 ra�zes reais:");						
					}else if(a==1 && b>1 && c<0) {//x�+2x-1 ok
						System.out.println("Para equa��o x�+"+b+"x"+c+"  existem 02 ra�zes reais:");						
					}else if(a==-1 && b>1 && c>0) {//-x�+2x+1 ok
						System.out.println("Para equa��o -x�+"+b+"x+"+c+"  existem 02 ra�zes reais:");						
					}else if(a==-1 && b==-1 && c>0) {//-x�-x+1 ok
						System.out.println("Para equa��o -x�+x+"+c+"  existem 02 ra�zes reais:");						
					}else if(a==1 && b==-1 && c<0) {//x�-x-1 ok
						System.out.println("Para equa��o x�-x"+c+"  existem 02 ra�zes reais:");						
					}else if(a==1 && b==1 && c<0){//x�+x-1 ok
						System.out.println("Para equa��o x�+x"+c+" existem 02 ra�zes reais:");							
					}else if(a>1 && b<-1 && c>0) {//2x�-2x+1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x+"+c+" existem 02 ra�zes reais:");						
					}else if(a>1 && b>1 && c>0) {//2x+2x+1	ok
						System.out.println("Para equa��o "+a+"x�+"+b+"x+"+c+" existem 02 ra�zes reais:");						
					}else {
						System.out.println("Para equa��o x�+"+b+"x+"+c+" existem 02 ra�zes reais:");						
					}
					
					System.out.println("Valor de raiz x1 = "+x1);
					System.out.println("Valor de raiz x2 = "+x2);
					
				}else if(delta < 0) {				
					System.out.println("Valor de delta: "+delta);
					if(a==-1 && b==-1 && c<0 ) {//-x�-x-1 ok
						System.out.println("Para equa��o -x�-x"+c+" n�o existem ra�zes reais:");					
					}else if(a==-1 && b<-1 && c<0) {//-x-2x-1 ok
						System.out.println("Para equa��o -x�"+b+"x"+c+" - n�o existem ra�zes reais:");						
					}else if(a<0 && b==-1 && c<0) {//-2x-x-1
						System.out.println("Para equa��o "+a+"x�-x"+c+" - n�o existem ra�zes reais:");	
					}else if(a>1 && b>1 && c>0) {//2x+2x+1	ok
						System.out.println("Para equa��o "+a+"x�+"+b+"x+"+c+" - n�o existem ra�zes reais:");						
					}else if(a==1 && b==1 && c>0){//x�+x+1
						System.out.println("Para equa��o "+a+"x�+"+b+"x+"+c+" - n�o existem ra�zes reais:");				
					}else if(a==-1 && b==1 && c<0){//-x�+x-1 ok
						System.out.println("Para equa��o -x�+x"+c+" n�o existem ra�zes reais:");					
					}else if(a>1 && b<-1 && c>0) {//2x�-2x+1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x+"+c+" n�o existem ra�zes reais:");					
					}else if(a==1 && b>1 && c>0) {//x+2x+1	ok
						System.out.println("Para equa��o x�+"+b+"x+"+c+" n�o existem ra�zes reais:");						
					}else if(a<-1 && b<-1 && c<0) {//-2x-2x-1 ok
						System.out.println("Para equa��o "+a+"x�"+b+"x"+c+" - n�o existem ra�zes reais:");						
					}else if(a==1 && b==-1 && c>0){//x�-x+1
						System.out.println("Para equa��o x�-x+"+c+" n�o existem ra�zes reais:");				
					}else if(a<-1 && b>-1 && c<0){//-2x�+2x-1						
						System.out.println("Para equa��o "+a+"x�+"+b+"x"+c+" n�o existem ra�zes reais:");				
					}else {//2x+x+1						
						System.out.println("Para equa��o "+a+"x�+x+"+c+" n�o existem ra�zes reais:");				
					}
					
				}else {					
					x1=(-b+Math.sqrt(delta))/(2*a);			
					System.out.println("Para equa��o "+a+"x�"+b+"x+"+c+" as ra�zes reais s�o iguais:");				
					System.out.println("Valor de delta: "+delta);
					System.out.println("Ra�zes reais iguais");
					System.out.println("Valor das ra�zes � = "+x1);				
				}	
				
			}else {
				System.out.println("Valor de B=0 ou C=0, n�o forma equa��o completa do 2� grau!!!");
				System.out.println("Informe valores diferentes de zero!!!");
			}			
			
		}else {			
			System.out.println("Valor de A = 0, n�o forma equa��o do 2� grau!!!");
			System.out.println("Informe valores diferentes de zero!!!");
		}
		
	}

}
