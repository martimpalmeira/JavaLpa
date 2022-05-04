package br.ucsal;

public class Prática20LPA {

	/*Problema: elabore uma solução para apresentar uma sequencia, 
	 * construída dinamicamente, com os 12 primeiros  valores múltiplo de 2, 
	 * contando o inicio a partir do valor 1, utilizando uma estrutura de repetição
	 * com teste no início (while)*/
	
	public static void main(String[] args) {
int multiploSeguinte = 2, ordemDoValor=1;
final int multiploDe = 2;
while (ordemDoValor <= 12) {
	System.out.print(multiploSeguinte+",");
	ordemDoValor++;
	multiploSeguinte = ordemDoValor * multiploDe;
}


}
}
