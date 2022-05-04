package primeiraAtividadeAvaliativa;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		double quantia = obterValor();
		int escolha = obterEscolha();
		if (escolha==1) {
			double convertido = realDolar(quantia);
			imprimir("O valor original é "+quantia+" a opção escolhida foi "+escolha+" e o valor convertido é "+convertido);
		}else if (escolha==2) {
			double convertido = dolarReal(quantia);
			imprimir("O valor original é "+quantia+" a opção escolhida foi "+escolha+" e o valor convertido é "+convertido);
		}else if (escolha==3) {
			double convertido = realEuro(quantia);
			imprimir("O valor original é "+quantia+" a opção escolhida foi "+escolha+" e o valor convertido é "+convertido);
		}else {
			double convertido = euroReal(quantia);
			imprimir("O valor original é "+quantia+" a opção escolhida foi "+escolha+" e o valor convertido é "+convertido);
		}
		
	}
	
	public static double obterValor() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double quantia;
		imprimir("Informe a quantia: ");
		quantia=sc.nextDouble();
		while (quantia<0) {
			imprimir("Informe uma quantia válida: ");
			quantia=sc.nextDouble();
		}
		return quantia;
		
	}
	
	public static int obterEscolha() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int escolha;
		imprimir("Informe a a opção de conversão desejada:\n1) De Real para Dólar\n2) "
				+ "De Dólar pra Real\n3) De Real pra Euro\n4) De Euro pra Real ");
		escolha=sc.nextInt();
		while (escolha>4 || escolha<1) {
			imprimir("Informe a a opção de conversão desejada:\n1) De Real para Dólar\n2) "
					+ "De Dólar pra Real\n3) De Real pra Euro\n4) De Euro pra Real ");
			escolha=sc.nextInt();
		}
		return escolha;
		
	}
	
	public static double realDolar(double valor) {
		double dolares;
		dolares = valor / 0.18;
		return dolares;
	}
	
	public static double dolarReal(double valor) {
		double reais;
		reais = valor * 0.18;
		return reais;
	}
	
	public static double realEuro(double valor) {
		double euros;
		euros = valor / 0.16;
		return euros;
	}
	
	public static double euroReal(double valor) {
		double reais;
		reais = valor * 0.16;
		return reais;
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	public static void imprimir(double str) {
		System.out.println(str);
	}

}
