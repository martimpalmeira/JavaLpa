package monitoria;

import java.util.Scanner;

public class Carro {
	
	/*01 - Crie uma classe de nome Carro e no seu método 
	 * main elabore um algoritmo em JAVA para ler 2 valores 
	 * que será referente a marca do carro e o modelo, deverá
	 *  ser criado também um método que será chamado na main 
	 *  para concatenar os 2 valores recebidos em apenas um*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String marcaCarro, modeloCarro;
		System.out.print("Informe a marca do carro: ");
		marcaCarro = sc.next();
		System.out.print("Informe o modelo do carro: ");
		modeloCarro = sc.next();
		System.out.print(concatenar(marcaCarro,modeloCarro));
		

	}
	
	public static String concatenar(String marca, String modelo) {
		return marca+" - "+modelo;
	}

}
