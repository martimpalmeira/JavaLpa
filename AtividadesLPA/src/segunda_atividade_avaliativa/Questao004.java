package segunda_atividade_avaliativa;

import java.util.Scanner;

public class Questao004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor01, valor02, valor03;
		System.out.println("Usuário digite o primeiro valor inteiro num intervalo fechado de 1 a 20: ");
		valor01 = sc.nextInt();
		System.out.println("Usuário digite o segundo valor inteiro num intervalo fechado de 1 a 20: "); 
		valor02 = sc.nextInt();
		System.out.println("Usuário digite o terceiro valor inteiro num intervalo fechado de 1 a 20: "); 
		valor03 = sc.nextInt();
		if (valor01>valor02 && valor01>valor03 && valor02>valor03) {
			System.out.println(valor01 +","+ valor02 +","+ valor03);	
		}
		else if(valor01>valor02 && valor01>valor03 && valor03>valor02) {
			System.out.println(valor01 +","+ valor03 +","+ valor02);
		}

		else if(valor02>valor01 && valor02>valor03 && valor01>valor03) {
			System.out.println(valor02 +","+ valor01 +","+ valor03);
		}
		else if(valor02>valor03 && valor02>valor01 && valor03>valor01) {
			System.out.println(valor02 +","+ valor03 +","+ valor01);
		}
		else if(valor03>valor01 && valor03>valor02 && valor01>valor02) {
			System.out.println(valor03 +","+ valor01 +","+ valor02);
		}
		else if(valor03>valor02 && valor03>valor01 && valor02>valor01) {
			System.out.println(valor03 +","+ valor02 +","+ valor01);
		}
		else if ((valor01>20 || valor01<1)
				|| (valor02>20 || valor02<1)
				|| (valor03>20 || valor03<1)) {

			System.out.println("Os valores não atendem");

		}
		
		else {
			System.out.println("Os valores não atendem");

		}
		sc.close();
	}
}
