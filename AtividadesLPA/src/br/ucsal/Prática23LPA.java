package br.ucsal;

public class Prática23LPA {

	/*Problema: elaborar uma sequencia decrescente de valores 
	inteiros, positivos, ímpares, divisíveis por 3, iniciada 
	pelo número 99, contendo 15 elementos. Utilize a estrutura 
	do/while para solucionar esse problema.*/
	
	public static void main(String[] args) {
		int numero=99, numeroDaSequencia=0;
		do {
			if (numero%3==0) {
				if(numero%2!=0) {
					System.out.print(numero+" ");
					numeroDaSequencia++;
				}
				
			}
			
			
			numero-=1;
			
		}while(numeroDaSequencia<15);

	}

}
