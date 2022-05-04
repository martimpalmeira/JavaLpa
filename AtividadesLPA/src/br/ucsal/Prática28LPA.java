package br.ucsal;

import java.util.Scanner;

public class Prática28LPA {

	public static void main(String[] args) {
	double tempF=0;
	double tempI = obterDados();
	int opc = obterEscolha();
	if (opc == 1){
		tempF = ck(tempI);
		imprimir("A temperatura convertida de Celcius para Kelvin é "+ tempF);
	}else if (opc == 2){
		tempF = kc(tempI);
		imprimir("A temperatura convertida de Kelvin para Celcius é "+ tempF);
	}else if (opc == 3){
		tempF = cf(tempI);
		imprimir("A temperatura convertida de Celcius para Fahrenheit é "+ tempF);
	}else if (opc == 4){
		tempF = fc(tempI);
		imprimir("A temperatura convertida de Fahrenheit para Celcius é "+ tempF);
	}else if (opc == 5){
		 tempF = kf(tempI);
		 imprimir("A temperatura convertida de Kelvin para Fahrenheit é "+ tempF);
	}else if (opc == 6){
		tempF = fk(tempI);
		imprimir("A temperatura convertida de Fahrenheit para Kelvin é "+ tempF);
	}else {
		imprimir("Opção inválida");
	}
	}
	public static double obterDados() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Informe a temperatura: ");
		return sc.nextDouble();
	}
	public static int obterEscolha() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		imprimir("Informe qual será a conversão:\n(1) "
				+ "De Celcius pra Kelvin\n(2) De Kelvin para Celcius\n(3) "
				+ "De Celcius pra Fahrenheit\n(4) De Fahrenheit pra Celcius\n(5) "
				+ "De Kelvin para Fahrenheit\n(6) De Fahrenheit pra Kelvin ");
		return sc.nextInt();
	}
	public static double ck(double c) {
		double k;
		k = c + 273;
		return k;
	}
	public static double kc(double k) {
		double c;
		c = k - 273;
		return c;
	}
	public static double cf(double c) {
		double f;
		f = 9*c/5 + 32;
		return f;
	}
	public static double fc(double f) {
		double c;
		c = 5*(f-32)/9;
		return c;
	}
	public static double kf(double k) {
		double f;
		f = 9*(k-273)/5 + 32;
		return f;
	}
	public static double fk(double f) {
		double k;
		k = 5*(f-32)/9 + 273;
		return k;
	}
	public static void imprimir(String str) {
		System.out.println(str);
	}
	public static void imprimir(double str) {
		System.out.println(str);
	}
	
	

}
