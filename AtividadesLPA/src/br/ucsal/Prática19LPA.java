package br.ucsal;

public class Prática19LPA {

	/*Problema: elabore uma solução para construir dinamicamente uma sequencia de valores 
	 * inteiros positivos, impares na qual o último valor não seja maior que 50.*/
	 
	
	public static void main(String[] args) {
	int	numeroSeqImpar = 1;
			while (numeroSeqImpar < 50) {					
				System.out.print(numeroSeqImpar + ",");	
				numeroSeqImpar+=2;
			}
					

	}

}
