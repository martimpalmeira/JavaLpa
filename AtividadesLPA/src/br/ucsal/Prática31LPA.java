package br.ucsal;

public class Prática31LPA {
	
	/*Problema: elabore uma solução para construir dinamicamente 
	 * uma sequencia de valores inteiros, crescentes, pares, 
	 * iniciada pelo valor 2, contendo 15 elementos. Considere que 
	 * a sequencia deverá ser construída de forma que cada valor 
	 * da sequencia seja um elemento de um array unidimensional que 
	 * será retornado de um método. Ao final o array deverá ser 
	 * impresso apresentando a sequencia elaborada. */
	
	public static void main(String[] args) {
		imprimir(obterNum());
	}
	
	public static int[] obterNum() {
		int[] numeros = new int[15];
		for(int i=0,x=2;i<numeros.length;i++,x++) {
			numeros[i]=x;
		}
		return numeros;
	}
	
	public static void imprimir(int[] v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i] + " ");
		}
	}
	
}
