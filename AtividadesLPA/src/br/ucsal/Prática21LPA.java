package br.ucsal;

public class Prática21LPA {
	
	/*Problema: elaborar uma sequencia de valores inteiros, positivos, ímpares 
	iniciada pelo número 1, contendo 20 elementos. Utilize a estrutura do/while 
		para solucionar esse problema.*/

	public static void main(String[] args) {
		int numero = 1, numeroDaSequencia = 0;
		do {
			System.out.print(numero + " ");
			numero+=2;
			numeroDaSequencia ++;
			
		}while(numeroDaSequencia < 20); 

	}

}
