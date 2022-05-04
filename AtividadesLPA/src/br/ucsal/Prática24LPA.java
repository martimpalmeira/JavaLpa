package br.ucsal;

public class Prática24LPA {

	/*Problema: a sequencia Fibonacci é uma sequência de números inteiros que 
	iniciando por 0 e 1 tem os termos subsequentes correspondes à soma dos 
	dois anteriores. Dessa forma, elabore uma solução para imprimir uma sequencia 
	Fibonacci contendo os 20 primeiros valores de uma sequencia fibonacci utilizando 
	a estrutura do / while.*/
	
	public static void main(String[] args) {
		int x1 = 0, x2 = 1, x3 = 1, numeroDaSequencia = 0;
		System.out.print(x1+" "+x2+" ");
		do {
			x3 = x1 + x2;
			System.out.print(x3+" ");
			x1 = x2;
			x2 = x3;
			numeroDaSequencia++;
					
		}while(numeroDaSequencia<18);
		

	}

}
