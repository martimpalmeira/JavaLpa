package monitoria;

import java.util.Scanner;

public class JogoDaSorte {

	/*02 - Crie uma classe de nome JogoDaSorte e no seu método main 
	elabore um algoritmo em JAVA para ler 1 valor inteiro entre 0 e 
	10, utilize uma variável já predefinida de um número da sorte ao 
	seu critério. Faça uma comparação com o número fornecido pelo 
	usuário e o numeroDaSorte definido por você, caso o usuário erre, 
	deverá ser concedido mais 2 tentativas de acerto, ao acabar as 
	chances deverá exibir uma mensagem "ACABOU O JOGO"*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numeroEscolhido, numeroDaSorte = 7, tentativas = 2;
		System.out.println("Informe um valor inteiro entre 0 e 10:");
		numeroEscolhido = sc.nextInt();
		while(numeroEscolhido!=numeroDaSorte && tentativas > 0) {
			tentativas -= 1;
			System.out.println("Informe um valor inteiro entre 0 e 10");
			numeroEscolhido = sc.nextInt();		
		}
		if(numeroEscolhido==7) {
			System.out.println("Parebéns você acertou!");
		}
		else if (tentativas==0){
			System.out.println("ACABOU O JOGO");
		}
		sc.close();
	}

}
