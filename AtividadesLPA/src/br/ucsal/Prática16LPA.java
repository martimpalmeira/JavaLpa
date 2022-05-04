package br.ucsal;

import java.util.Scanner;

public class Prática16LPA {

	/*Problema: elabore uma solução para implementar uma calculadora das 04 operações básicas: somar, 
	 * dividir, subtrair e multiplicar utilizando a estrutura switch/case. Nessa solução o usuário deverá 
	 * informar apenas dois valores e escolher a operação que deseja realizar em um menu de opções elaborado 
	 * com switch/case. Para essa solução, considere os seguintes critérios:
		a) O usuário deverá informar valores iguais ou superiores a 1
		b) No caso da divisão é possível que o resultado seja um valor decimal
		c) Caso o usuário escolha uma operação diferente das disponibilizadas, o resultado deverá ser valor 
		inválido*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1=0, valor2=0, resultado=0;
		String operacao;
		System.out.println("Informe o primeiro valor");
		valor1 = sc.nextDouble();
		System.out.println("Informe qual a operação desejada:\n(+)Soma\n(-)Subtração\n(*)Multiplicação\n(/)Divisão");
		operacao = sc.next();
		System.out.println("Informe o segundo valor");
		valor2 = sc.nextDouble();
		if (valor1>=1 && valor2>=1) {
		switch (operacao) {
		case ("+") :
		resultado = valor1 + valor2;
		System.out.println("O resultado é "+ resultado);
		break;
		case ("-") :
		resultado = valor1 - valor2;
		System.out.println("O resultado é "+ resultado);
		break;
		case ("*") :
		resultado = valor1 * valor2;
		System.out.println("O resultado é "+ resultado);
		break;
		case ("/") :
		resultado = valor1/valor2;
		System.out.println("O resultado é "+ resultado);	
		break;
		default: System.out.println("Operação inválida");
			}	
		}
		
		else {
			System.out.println("Valores inválidos");
		}
		sc.close();
	
	}
}
