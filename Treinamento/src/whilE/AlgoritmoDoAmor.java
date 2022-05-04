package whilE;

import java.util.Scanner;

public class AlgoritmoDoAmor {
	public static void main(String[] args) {
		int Frase = Idade();
		switch(Frase) {
		case 1: imprimir("Não preciso ativar minha localização. "
				+ "Todo mundo sabe que eu tô na sua");
		break;
		case 2: imprimir("Você é como o Google. Tudo o que eu procuro, "
				+ "eu encontro em você");
		break;
		case 3: imprimir("Se amar é errado, meu maior defeito é estar apaixonado "
				+ "por você");
		break;
		case 4: imprimir("Você concorda que 'agente' junto é erro de português e "
				+ "'a gente' separado é erro do destino");
		break;
		default: imprimir("A frase não existe");
		}
	}
	
	public static int Idade() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é sua idade ? (1) 20 a 30 anos (2) 31 a 41 anos (3) 41 a 50 anos "
				+ "(4) Maior que 50 anos");
		int idade = sc.nextInt();
		return idade;
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
}
