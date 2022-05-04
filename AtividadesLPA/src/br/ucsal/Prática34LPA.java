package br.ucsal;

import java.util.Scanner;

public class Prática34LPA {

	public static void main(String[] args) {
		int tam=6;
		String[] listaDeNomes=(obterNomes(tam));
		for(int i=0;i<listaDeNomes.length;i++) {
			imprimir(listaDeNomes[i]+" "+obterIndicePeloNome(listaDeNomes[i],listaDeNomes)+", ");
		}
	}
	
	public static String[] obterNomes(int tam) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[tam];
		for(int i=0;i<tam;i++) {
			imprimir("Digite um nome: ");
			nomes[i]=sc.next();
		}
		
		return nomes;
	}
	
	public static String obterNomePeloIndice(int indice, String[] nomes) {
		return nomes[indice];
	}
		
	
	public static Integer obterIndicePeloNome(String nome, String[] vet) {
		int i=0;
		for(;!vet[i].equals(nome);i++) {
			}
			
			return i;
		} 
	
	
	public static void imprimir(String s) {
		System.out.print(s);
	}
	
	public static void imprimir(int n) {
		System.out.print(n);
	}
	
	public static void imprimir(String[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}

}
