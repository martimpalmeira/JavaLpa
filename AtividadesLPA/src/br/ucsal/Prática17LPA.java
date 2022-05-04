package br.ucsal;

import java.util.Scanner;

public class Prática17LPA {

	/*Problema: utilize a estrutura do switch / case para formular uma 
	 * questão / resposta conforme descrito abaixo:

		Questão 01: Indique, entre as opções abaixo, um animal considerado invertebrado:
		(a) minhoca
		(b) aranha
		(c) cachorro
		(d) gato

		Caso o valor indicado da alternativa esteja correto, deve ser apresentado na 
		tela "alternativa correta" e a pontuação de valor 1 deverá ser atribuída. Caso 
		contrário, deve ser apresentado na tela "alternativa errada" e o valor zero 
		deverá ser atribuído na pontuação.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alternativa;
		int pontuacaoinicial=0, pontuacaofinal;
		System.out.println("Indique entre as opções abaixo, um animal considerado invertebrado:\na)minhoca\nb)aranha\nc)cachorro\nd)gato");
		alternativa = sc.next().charAt(0);
		switch (alternativa) {
		case ('a'):
			pontuacaofinal = pontuacaoinicial + 1;
			System.out.println("Alternatica correta " + pontuacaofinal);
			break;
		case ('b'):
			pontuacaofinal = pontuacaoinicial + 1;
			System.out.println("Alternatica correta "+ pontuacaofinal);
			break;
		case ('c'):
			pontuacaofinal = pontuacaoinicial + 0;
			System.out.println("Alternatica incorreta "+ pontuacaofinal);
			break;
		case ('d'):
			pontuacaofinal = pontuacaoinicial + 0;
			System.out.println("Alternatica incorreta "+ pontuacaofinal);
			break;
		default:
			System.out.println("Alternatica inválida");
			break;
			
		
		}
		sc.close();
	}

}
