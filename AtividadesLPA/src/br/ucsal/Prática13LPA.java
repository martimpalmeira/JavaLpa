package br.ucsal;

import java.util.Scanner;

public class Prática13LPA {
	/* O objetivo desse algoritmo é elaborar uma calculadora para apresentar um resultado 
	 * final, a partir de 02 valores informados pelo usuário e da escolha da operação que 
	 * será realizada. Se o usuário não escolher nenhuma das 04 operações básicas: somar, 
	 * subtrair, dividir ou multiplicar o algoritmo deverá informar operação inválida */
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double valor_01, valor_02, resultado;
			int operacao;
			System.out.println("Usuário digite o primeiro valor: ");
			valor_01 = sc.nextDouble();
			System.out.println("Usuário escolha uma das seguintes operações: \n(1)somar \n(2)subtrair \n(3)multiplicar \n(4)dividir");
			operacao = sc.nextInt();
			System.out.println("Usuário digite o segundo valor:  ");
			valor_02 = sc.nextDouble();
			if (operacao==1) {resultado = valor_01 + valor_02; 
			System.out.println("O resultado da soma é: " + resultado);
			}
				
			else if (operacao==2) {resultado = valor_01 - valor_02;
			System.out.println("O resultado da subtração é: " + resultado);
			}
				
			else if (operacao==3) {resultado = valor_01 * valor_02;
			System.out.println("O resultado da multiplicação é " + resultado);
			}
				
			else if (operacao==4) {resultado = valor_01 / valor_02;
			System.out.println("O resultado da divisão é: " + resultado);
			}
				
			else System.out.println("Operação Inválida");
			sc.close();
		}
}
