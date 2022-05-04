package monitoria;

import java.util.Scanner;

import java.lang.Math;

public class NumeroDaSorte {
	
	/*02 - Crie uma classe de nome NumeroDaSorte e no 
	 * seu método main elabore um algoritmo em JAVA para 
	 * ler 2 valores que será referente a seu nome e ao 
	 * número da sorte, crie um método que irá pegar o 
	 * nome do usuário e dar um número da sorte random 
	 * de 1 até 100, concatenando o valor de nome + número 
	 * da sorte.*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String nome;
		System.out.print("Informe o seu nome: ");
		nome = sc.next();
		System.out.print(numeroDaSorteUsuario(nome));

	}
	
	public static String numeroDaSorteUsuario (String nome) {
		int max=100, min=1;
		int n = (int)(Math.random()*max)+min;

		return nome+" seu número da sorte é "+n;
	}
	
}
