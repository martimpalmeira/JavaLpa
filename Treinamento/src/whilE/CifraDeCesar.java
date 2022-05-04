package whilE;

import java.util.Scanner;

public class CifraDeCesar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char[] lista={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.print("Escreva algo: ");
		String textoUsuario=sc.next();
		char[] listaTexto = new char[textoUsuario.length()];
		char l1,l2;
		for(int i=0;i<textoUsuario.length();i++) {
			listaTexto[i]= textoUsuario.charAt(i);
		}
		
	
		for(int i=0,x=0,y=0;i<listaTexto.length-1;i++) {
			
			l1=listaTexto[i];
			System.out.print(l1);
			y=0;
			for(int i2=0;i<lista.length-1;i2++) {
				l2=lista[i2];
				if(y==23) {
					y=-3;
				}if(l1==l2) {
					listaTexto[x]=lista[y+3];
					System.out.print(lista[y+3]);
					}y++;
			}x++;
		}
		imprimir(listaTexto);
	}
	
	
	
	public static void imprimir (char[] vetor) {
		System.out.print(vetor);
	}

}
