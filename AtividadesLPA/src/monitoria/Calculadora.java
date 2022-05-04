package monitoria;

import java.util.Scanner;

public class Calculadora {

	/*01 -
	Crie uma classe de nome Calculadora e no seu método 
	main elabore um algoritmo em JAVA para ler 02 valores 
	informados pelo usuário e a escolha de qual das quatro 
	operações básicas (Somar, Subtrair, Dividir e Multiplicar) 
	deseja realizar, logo após apresente o resultado da 
	operação escolhida.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1, valor2, resultado;
		String operacao;
		System.out.println("Usuário informe o primeiro valor: ");
		valor1 = sc.nextDouble();
		System.out.println("Usuário informe a operação desejada: \n(+) Soma\n(-) Substração\n(*) Multiplicação\n(/) Divisão");
		operacao = sc.next();
		System.out.println("Usuário informe o segundo valor");
		valor2 = sc.nextDouble();
		if (operacao.equals ("+")) {
			resultado = valor1 + valor2;
			System.out.println("O resultado da operação é: "+resultado);
		}
		else if (operacao.equals ("-")) {
			resultado = valor1 - valor2;
			System.out.println("O resultado da operação é: "+resultado);
		}
		else if (operacao.equals ("*")) {
			resultado = valor1 * valor2;
			System.out.println("O resultado da operação é: "+resultado);
		}
		else if (operacao.equals ("/")) {
			resultado = valor1 / valor2;
			System.out.println("O resultado da operação é: "+resultado);
		}
		sc.close();
		
		
		

	}

}
