package br.ucsal;

import java.util.Scanner;

public class Prática15LPA {

	/*Problema: elabore uma solução utilizando switch/case para, a partir de um 
	 * valor inteiro informado no intervalo de 1 a 7, seja impresso o dia da semana 
	 * por extenso. Valores informados fora desse intervalo imprimir "dia inválido".*/
	
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			int dia = 0;
			System.out.println("Informe um valor inteiro num intervalo de 1 a 7: ");
			dia = sc.nextInt();
			switch (dia) {
			case 1:
			System.out.println("O dia da semana é domingo");
			break;
			case 2:
			System.out.println("O dia da semana é segunda");
			break;
			case 3:
			System.out.println("O dia da semana é terça");
			break;
			case 4:
			System.out.println("O dia da semana é quarta");
			break;
			case 5:
			System.out.println("O dia da semana é quinta");
			break;
			case 6:
			System.out.println("O dia da semana é sexta");
			break;
			case 7:
			System.out.println("O dia da semana é sábado");
			break;
			default:
			System.out.println("Opção Inválida");
			}
		sc.close();
			
	}

}
