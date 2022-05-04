package br.ucsal;

public class Prática32LPA {

	public static void main(String[] args) {
		/* Problema: elabore uma solução para construir dinamicamente 
		 * uma sequencia de valores inteiros, crescentes, 
		 * iniciada pelo valor 1, contendo 30 elementos.  
		 * Considere que a sequencia deverá ser construída de 
		 * forma que cada valor da sequencia seja um elemento de 
		 * um array unidimensional que será retornado de um método. 
		 * Ao final o array deverá ser impresso apresentando a sequencia elaborada.*/
		imprimir(obterNum());

	}
	public static int[] obterNum()  {
		int[] numeros=new int[30];
		for(int i=0,x=1;i<30;i++,x++) {
			numeros[i]=x;
		}return numeros;
	}
	
	public static void imprimir(int[] v) {
		for(int i=0;i<30;i++) {
		System.out.print(v[i]+" ");
		}
	}

}
