package br.ucsal;

public class Prática33LPA {

	public static void main(String[] args) {
		/*Problema: na matemática, a Sucessão de Fibonacci 
		 * (ou Sequência de Fibonacci), é uma sequência de 
		 * números inteiros, começando normalmente por 0 e 1, 
		 * na qual, cada termo subsequente corresponde à soma 
		 * dos dois anteriores.Diante da explicação, elabore 
		 * uma solução para preencher um array unidimensional com 
		 * uma sequencia com os 30 primeiros valores inteiros, 
		 * positivos de uma sequencia fibonacci. Lembrando que a 
		 * sequencia inicia com 0 e 1. */
		int tam=30;
		imprimir(sequencia(tam));

	}
	public static int[] sequencia(int tam) {
		int[] seq = new int[tam];
		for(int i=0,x=0,y=1,z=1;i<tam;i++) {
			seq[i]= x;
			z=x+y;
			x=y;
			y=z;		
			
		}return seq;
	}
		
	public static void imprimir(int[] v) {
		for(int i=0;i<v.length;i++) {
		System.out.print(v[i]+" ");
		}
	}
	

}
