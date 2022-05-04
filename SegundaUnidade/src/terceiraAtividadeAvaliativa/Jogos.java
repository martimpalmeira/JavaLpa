package terceiraAtividadeAvaliativa;

import java.util.*;

public class Jogos {
	static int escolhaDoUsuario;
	static String nomeUsuario1,nomeUsuario2;

	public static void main(String[] args) {
		int pontosJ1 = 0, pontosJ2 = 0, ponto=0, x=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		imprimir("Primeiro jogador, informe o seu nome: ");
		nomeUsuario1 = sc.nextLine();

		imprimir("Segundo jogador, informe o seu nome: ");
		nomeUsuario2 = sc.nextLine();

		while(x!=1) {
			imprimir2("\n%s, escolha o seu jogo: \n[1] Jogo da velha \n[2] Jogo da forca\n ", nomeUsuario1);
			escolhaDoUsuario = sc.nextInt();
			imprimir("");

			if(escolhaDoUsuario == 1){
				System.out.print("");
				ponto = daVelha();
				if (ponto==1) {
					pontosJ1+=ponto;
				} else {
					pontosJ2+=ponto-1;
				}
				ponto=0;
			} else if (escolhaDoUsuario == 2){
				jogoDaForca();
			} else {
				imprimir("Escolha de jogo inválida");
			}

			imprimir("Deseja jogar novamente? [1] Sim [2] Não");
			escolhaDoUsuario = sc.nextInt();
			switch(escolhaDoUsuario) {
			case 1: break;
			case 2:	
			default: imprimir("\nPontuação final:\n"+nomeUsuario1+": "+pontosJ1+"\n"+nomeUsuario2+": "+pontosJ2); x=1;
			}
		}


	}

	public static int daVelha() {
		char[][] seq = new char[3][3];
		int valor = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				seq[i][j] = '-';
			}
		}

		while ((Vencedor1(seq)==false) && (Vencedor2(seq)==false)) {


			imprimir(seq);
			System.out.println("");
			seq = turno1(seq);
			imprimir(seq);
			seq = turno2(seq);
			imprimir(seq);
			seq = turno1(seq);
			imprimir(seq);
			seq = turno2(seq);
			imprimir(seq);
			seq = turno1(seq);

			if(Vencedor1(seq)) {
				valor=1;
				break;
			}
			imprimir(seq);    
			seq = turno2(seq);
			if(Vencedor2(seq)) {
				valor=2;
				break;
			}
			imprimir(seq);
			seq = turno1(seq);
			if(Vencedor1(seq)) {
				valor=1;
				break;
			}
			imprimir(seq);
			seq = turno2(seq);
			if(Vencedor2(seq)) {
				valor=2;
				break;
			}
			imprimir(seq);
			seq = turno1(seq);
			if(Vencedor1(seq)) {
				valor=1;
				break;
			}
			imprimir(seq);

		}

		return valor; 
	}



	public static char[][] turno1(char[][] jogo){
		@SuppressWarnings("resource")
		Scanner tec1 = new Scanner(System.in);
		int pos1=0,pos2=0,x=0,y=0;

		while (x!=1) {

			while(y!=1) {

				imprimir(nomeUsuario1+" (X) , digite a linha e a coluna que deseja colocar sua marcação: (Máximo 3 linhas ou 3 colunas)");
				imprimir("\nLinha:");

				pos1 = tec1.nextInt();

				switch(pos1) {
				case 1:
				case 2:
				case 3: y=1; break;
				default:
				}

				imprimir("\nColuna:");
				pos2 = tec1.nextInt();
				imprimir("");

				switch(pos2) {
				case 1:
				case 2:
				case 3: if (y==0) {imprimir("Essa posição não pode ser preenchida!\n");} break;
				default: imprimir("Essa posição não pode ser preenchida!\n"); y=0;
				}
			} y=0;

			//VALIDAÇÃO
			if (jogo[pos1-1][pos2-1]==88 || jogo[pos1-1][pos2-1]==79) {
				imprimir("Posição já está ocupada!\n");
			} else {
				jogo[pos1-1][pos2-1] = 'X';
				x=1;
			}
		}

		return jogo;
	}

	public static char[][] turno2(char[][] jogo){
		@SuppressWarnings("resource")
		Scanner tec1 = new Scanner(System.in);
		int pos1=0,pos2=0,x=0,y=0;

		while (x!=1) {

			while(y!=1) {

				imprimir(nomeUsuario2+" (O) , digite a linha e a coluna que deseja colocar sua marcação: (Máximo 3 linhas ou 3 colunas)");
				imprimir("\nLinha:");

				pos1 = tec1.nextInt();

				switch(pos1) {
				case 1:
				case 2:
				case 3: y=1; break;
				default:
				}

				imprimir("\nColuna:");
				pos2 = tec1.nextInt();
				imprimir("");

				switch(pos2) {
				case 1:
				case 2:
				case 3: if (y==0) {imprimir("Essa posição não pode ser preenchida!\n");} break;
				default: imprimir("Essa posição não pode ser preenchida!\n"); y=0;

				}
			} y=0;

			//VALIDAÇÃO
			if (jogo[pos1-1][pos2-1]==88 || jogo[pos1-1][pos2-1]==79) {
				imprimir("Posição já está ocupada!\n");
			} else {
				jogo[pos1-1][pos2-1] = 'O';
				x=1;
			}
		}

		return jogo;
	}

	public static boolean posicoes(int pos){

		return false;
	}

	public static boolean Vencedor2(char[][]seq) {
		boolean eVencedor=false;
		if ((seq[0][0]=='O'&& seq[1][0]=='O' && seq[2][0]=='O')||
				(seq[0][1]=='O' && seq[1][1]=='O' && seq[2][1]=='O')||
				(seq[0][2]=='O' && seq[1][2]=='O' && seq[2][2]=='O')||
				(seq[0][0]=='O' && seq[0][1]=='O' && seq[0][2]=='O')||//linha
				(seq[1][0]=='O' && seq[1][1]=='O' && seq[1][2]=='O')||//linha
				(seq[2][0]=='O' && seq[2][1]=='O' && seq[2][2]=='O')||//linha
				(seq[0][0]=='O' && seq[1][1]=='O' && seq[2][2]=='O')||//diagonal
				(seq[2][0]=='O' && seq[1][1]=='O' && seq[0][2]=='O'))//diagonal
		{
			System.out.print(nomeUsuario2+" venceu\n");
			eVencedor=true;
		}
		return eVencedor;
	}

	public static boolean Vencedor1(char[][]seq) {
		boolean eVencedor=false;
		if ((seq[0][0]=='X'&& seq[1][0]=='X' && seq[2][0]=='X')||
				(seq[0][1]=='X' && seq[1][1]=='X' && seq[2][1]=='X')||
				(seq[0][2]=='X' && seq[1][2]=='X' && seq[2][2]=='X')||
				(seq[0][0]=='X' && seq[0][1]=='X' && seq[0][2]=='X')||//linha
				(seq[1][0]=='X' && seq[1][1]=='X' && seq[1][2]=='X')||//linha
				(seq[2][0]=='X' && seq[2][1]=='X' && seq[2][2]=='X')||//linha
				(seq[0][0]=='X' && seq[1][1]=='X' && seq[2][2]=='X')||//diagonal
				(seq[2][0]=='X' && seq[1][1]=='X' && seq[0][2]=='X'))//diagonal
		{
			System.out.print(nomeUsuario1+" venceu\n");
			eVencedor=true;
		}
		return eVencedor;
	}

	// JOGO DA FORCA


	public static void jogoDaForca() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		String[] frases = {"borboleta", "cachorro", "passarinho", "flor"};
		int index = new Random().nextInt(3);
		String palavraSelecionada = frases[index];

		char[] traco = new char[palavraSelecionada.length()];
		for (int i = 0; i < palavraSelecionada.length(); i++) {
			traco[i] = '_';
		}

		int palavraString = frases[index].length();
		int tentativa = 6;

		while (palavraString > 0 && tentativa > 0) {
			enforcado(6-tentativa);
			for (int i = 0; i < palavraSelecionada.length(); i++) {
				System.out.print(" " + traco[i] + "  ");
			}
			System.out.println("");

			System.out.println("Você tem  " + tentativa + "  chances de adivinhar");
			System.out.println("A palavra tem " + palavraString + " letras restantes");
			System.out.println("Digite uma letra: ");

			char letra = teclado.next().charAt(0);
			char letras = Character.toLowerCase(letra);
			boolean letraCorreta = false;

			for (int i = 0; i < traco.length; i++) {

				if (frases[index].charAt(i) == letras) {
					traco[i] = letras;
					palavraString--;
					letraCorreta = true;
				}
			}

			if (!letraCorreta) {
				tentativa--;
			}
		}

		if (palavraString == 0) {
			System.out.println(" PARABENS! Você Acertou a palavra! ");
		} else {
			enforcado(6);
			System.out.println("Infelizmente Você Errou ");
			System.out.println("A palavra era " + palavraSelecionada);
		}
	}

	public static void enforcado(int num) {
		switch(num) {
		case 0: System.out.println(" ______________\n|              |\n|              |\n|              \n|               \n|               \n|               \n|               \n|");break;
		case 1: System.out.println(" ______________\n|              |\n|              |\n|              o\n|               \n|               \n|               \n|               \n|");break;
		case 2: System.out.println(" ______________\n|              |\n|              |\n|              o\n|              |\n|                \n|               \n|              \n|");break;
		case 3: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\n|                \n|               \n|              \n|");break;
		case 4: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|               \n|               \n|              \n|");break;
		case 5: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             /\n|               \n|              \n|");break;
		case 6: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             / \\\n|               \n|              \n|");break;
		default: System.out.println(" ______________\n|              |\n|              |\n|              o\n|             /|\\\n|             / \\\n|               \n|              \n|");
		}
	}

	// metodos basicos:

	public static void imprimir(char[][] v) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("|" + v[i][j]);
			}
			System.out.println("|\n");
		}
	}

	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	public static void imprimir2(String arg, String nome) {
		System.out.printf(arg,nome);
	}
}
