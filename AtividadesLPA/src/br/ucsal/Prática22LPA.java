package br.ucsal;

public class Prática22LPA {

	/*Problema: elabore uma solução para apresentar uma sequencia, 
	construída dinamicamente, com os 12 primeiros valores múltiplo 
	de 2, com a variável inicializada com valor 1, utilizando uma 
	estrutura de repetição com teste no início (do/while).*/
	
	public static void main(String[] args) {
		int numeroDaSequencia = 0, numero = 1;
		final int MULTIPLICADOR = 2;
		do {
			
			if (numero==1) {
				numero++;
			}
			System.out.print(numero+" ");
			
			numero = MULTIPLICADOR+numero;
			numeroDaSequencia++;
		}while(numeroDaSequencia<12);

	}

}
