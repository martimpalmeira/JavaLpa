package br.ucsal;



public class Prática18LPA {

	/*Problema: Elabore uma solução para apresentar uma sequencia crescente de valores iniciando 
	 * com 1 e finalizando em 50, utilizando a estrutura de repetição com teste no início (while)*/
	
	public static void main(String[] args) {
int numeroDaSequencia = 1;
		while (numeroDaSequencia <= 50){
			
			System.out.print(numeroDaSequencia+",");
			numeroDaSequencia ++;
		}
		
		System.out.println("\nFim do programa");

	}

}
