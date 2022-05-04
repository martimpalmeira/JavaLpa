package br.ucsal;

import java.util.Scanner;

/*Problema: elabore uma Progressão Aritmética de valores inteiros, positivos, 
 iniciada com o valor 10 e razão 6, na qual o valor limite da sequencia 
 será informado pelo usuário (executor), obedecendo aos seguintes critérios:
(1) O valor limite deve ser informado pelo usuário em um intervalo fechado de 50 e 100.
(2) Se o usuário informar qualquer valor fora desse intervalo, o algoritmo deverá permanecer 
solicitando o valor, até que seja informado dentro do intervalo definido. 
(3) A sequencia só será construída quando o usuário informar o valor dentro do intervalo correto.


Com base no texto acima:
a) Apresente a sequencia formada
b) Calcule a quantidade de elementos da sequencia
c) Calcule a média aritmética do primeiro e último valor da sequencia.
d) Identifique a quantidade de números pares existentes na sequencia
e) Identifique a quantidade de números ímpares existentes na sequencia
f) Identifique a quantidade de números ímpares divisíveis por 3 existentes na sequencia
g) Calcule a soma de todos os elementos da sequencia 
h) Calcule a média ponderada do 4º e do 10º numero da sequencia, considerando os pesos 4 e 6 
respectivamente, quando for possível.


Caso a sequencia não apresente um desses elementos, o mesmo deverá ser informado.*/

public class Prática26LPA {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int nLimite, n1 = 10 , quantElementos=0, ultimoValor, mediaAritmetica, 
				numerosPares=0, numerosImparesPor3=0, numerosImpares=0,somaDosElementos, n4, n10, mediaPonderada;
		final int PESO1=4, PESO2=6;
		System.out.println("Informe o valor limite da PA que esteja num intervalo fechado entre 50 e 100");
		nLimite = input.nextInt();
		for (; nLimite>100 || nLimite<50;) {
			System.out.println("Informe o valor limite da PA que esteja num intervalo fechado entre 50 e 100");
			nLimite = input.nextInt();			
		}
		for(; nLimite>=50 && nLimite<=100 && n1<=nLimite ; n1+=6, quantElementos++) {
				System.out.print(n1+" ");	
				if (n1%2==0) {
					numerosPares++;
				}else {
					if (n1%3==0) {
						numerosImparesPor3++;
					}else {
						numerosImpares++;
					}
				}
			}
		System.out.println("\nA quantidade de elementos é "+ quantElementos);
		
		ultimoValor = 10 + 6*(quantElementos-1);
		mediaAritmetica = (ultimoValor+10)/2;
		System.out.println("A média aritmética do primeiro e último valor é "+ mediaAritmetica);
		System.out.println("A quantidade de números pares é "+ numerosPares);
		System.out.println("A quantidade de números ímpares é "+ numerosImpares);
		System.out.println("A quantidade de números ímpares divisíveis por 3 é "+ numerosImparesPor3);
		somaDosElementos = (10 + ultimoValor) * quantElementos/2;
		System.out.println("A soma de todos os elementos da sequência é "+ somaDosElementos);
		n4 = 10 + (4-1)*6;
		n10 = 10 + (10-1)*6;
		if (quantElementos>=10) {
			mediaPonderada = (n4*PESO1 + n10*PESO2)/(PESO1 + PESO2);
			System.out.println("A média ponderada entre o quarto e o décimo termo da sequência é "+ mediaPonderada);
		}
		else {
			System.out.println("A sequência não apresenta o décimo termo");
		}
		
		input.close();	
	}

}
