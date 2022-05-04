package br.ucsal;

import java.util.Scanner;

public class Prática27LPA {
	
/*Problema: elabore uma solução para construir uma calculadora com quatro operações básicas. 
 * Cada operação deverá ser construída em um método específico. A impressão dos resultados 
 * deve estar centralizada em um método chamado "imprimir" e o método "main" deve ser utilizado 
 * apenas para iniciar a execução da solução. Para essa solução, o usuário deverá informar 02 valores 
 * (podem ser decimais), em um metodo especifico "obterDados" e escolher qual 
 * a operação que deseja realizar em um método chamado "obterOperacao": somar, subtrair, dividir 
 * e multiplicar.*/

	public static void main(String[] args) {
		calculo();

	}
	
	
	public static double obterDados() {
		@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um valor");
	return sc.nextDouble();
	
		
	}
	public static char obterOperacao(){
		@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Escolha a operação: \n(+)Soma\n(-)Subtração\n(*)Multiplicação\n(/)Divisão\n");
	return sc.next().charAt(0);
	}
	
	public static double soma(double valor1, double valor2){
		return valor1+valor2;
	}
	
	public static double subtracao(double valor1, double valor2){
		return (valor1 - valor2);
	}
	
	public static double multiplicacao(double valor1, double valor2){
		return (valor1 * valor2);
	}
	
	public static double divisao(double valor1, double valor2){
		return (valor1 / valor2);
	}
	public static void calculo() {
		double valor1 = obterDados();
		char operacao = obterOperacao();
		double valor2 = obterDados();
		double resultado = 0;
		switch (operacao) {
			case ('+'):
				resultado = soma(valor1,valor2);
				break;
			case ('-'):
				resultado = subtracao(valor1,valor2);
				break;
			case ('*'):
				resultado = multiplicacao(valor1,valor2);
				break;
			case ('/'):
				resultado = divisao(valor1,valor2);
				break;
		}imprimir(resultado);
	}
	public static void imprimir(double resultado){
		System.out.println(resultado);
	}

}
