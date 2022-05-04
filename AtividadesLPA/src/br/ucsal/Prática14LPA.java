package br.ucsal;

import java.util.Scanner;

public class Prática14LPA {

	public static void main(String[] args) {
	/*Problema: Elabore uma solução para que, a partir 
	 * de 03 valores inteiros aleatórios não repetidos informados 
	 * pelo usuário em um intervalo fechado de 10 a 90, seja apresentado 
	 * qual o maior e qual o menor dos três valores, utilizando apenas 
	 * estrutura de decisão. Para isso, considere 
	 * que:a) Caso algum valor informado esteja fora do intervalo ou repetido 
	 * o resultado apresentado deve ser "valores incorretos"*/
		
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Usuário informe o primeiro valor inteiro que esteja num intervalo fechado de 10 a 90:");
		valor1 = sc.nextInt();
		System.out.println("Usuário informe o segundo valor inteiro que esteja num intervalo fechado de 10 a 90:");
		valor2 = sc.nextInt();
		System.out.println("Usuário informe o terceiro valor inteiro que esteja num intervalo fechado de 10 a 90:");
		valor3 = sc.nextInt();
		if 	((valor1 != valor2) && (valor1 != valor3) && (valor2 != valor3) && (valor1>=10 && valor1<=90) && (10<=valor2 && valor2<=90) && (10<=valor3 && valor3<=90)){
			 if (valor1 > valor2 && valor1 > valor3 && valor2>valor3) {
			System.out.println("O maior valor é "+valor1+"e o menor valor é "+valor3);
			}
			 else if (valor1 > valor2 && valor1 > valor3 && valor3>valor2) {
			System.out.println("O maior valor é "+valor1+" e o menor valor é "+valor2);
			}
			 else if (valor2 > valor1 && valor2 > valor3 && valor1>valor3) {
			System.out.println("O maior valor é "+valor2+" e o menor valor é "+valor3);
			}
			 else if (valor2 > valor1 && valor2 > valor3 && valor3>valor1) {
			System.out.println("O maior valor é "+valor2+" e o menor valor é "+valor1);
			}
			 else if (valor3 > valor1 && valor3 > valor2 && valor1>valor2) {
			System.out.println("O maior valor é "+valor3+" e o menor valor é "+valor2);
			}
			 else  {
			System.out.println("O maior valor é "+valor3+" e o menor valor é "+valor1);
			}			 	
		}	
		else {
			System.out.println("Valores incorretos");
		}
		
		sc.close();
	}
}