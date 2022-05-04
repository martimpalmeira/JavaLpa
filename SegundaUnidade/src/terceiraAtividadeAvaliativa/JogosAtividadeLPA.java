package terceiraAtividadeAvaliativa;

import java.util.*;

public class JogosAtividadeLPA {
    static int escolhaDoUsuario;
    static String nomeUsuario1,nomeUsuario2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimir("Primeiro jogador, informe o seu nome: ");
        nomeUsuario1 = sc.nextLine();
        
        imprimir("Segundo jogador, informe o seu nome: ");
        nomeUsuario2 = sc.nextLine();

        System.out.printf("\n%s, escolha o seu jogo: [1] Jogo da velha [2] Jogo da forca: ", nomeUsuario1);
        escolhaDoUsuario = sc.nextInt();

        if(escolhaDoUsuario == 1){
            System.out.print("");
            daVelha();
        }else if(escolhaDoUsuario == 2){
            jogoDaForca();
        }else{
            System.out.print("Escolha de jogo inválida");
        }




    }

    public static char[][] daVelha() {
        char[][] seq = new char[3][3];
        char[][] seqBackup = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                seq[i][j] = '-';
            }
        }
        seqBackup = seq; //um backup pra receber a tabela zerada;

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
        	imprimir(seq);
        	break;
        }
        imprimir(seq);    
        seq = turno2(seq);
        if(Vencedor2(seq)) {
        	imprimir(seq);
        	break;
        }
        imprimir(seq);
        seq = turno1(seq);
        if(Vencedor1(seq)) {
        	imprimir(seq);
        	break;
        }
        imprimir(seq);
        seq = turno2(seq);
        if(Vencedor2(seq)) {
        	imprimir(seq);
        	break;
        }
        imprimir(seq);
        seq = turno1(seq);
        if(Vencedor1(seq)) {
        	imprimir(seq);
        	break;
        }
        imprimir(seq);
        imprimir("Empate!");
        break;
        
        }
        
       return seq; 
    }
        
        

    public static char[][] turno1(char[][] jogo){
        Scanner tec1 = new Scanner(System.in);
        int pos1,pos2;
        imprimir(nomeUsuario1+", digite a linha e a coluna que deseja colocar sua marcação: ");
        imprimir("Linha:");
        pos1 = tec1.nextInt();
        imprimir("Coluna:");
        pos2 = tec1.nextInt();

        jogo[pos1-1][pos2-1] = 'x';
        if (jogo[pos1-1][pos2-1] == 'o') {
        	imprimir("Digita outro");
        }

        return jogo;
    }

    public static char[][] turno2(char[][] jogo){
        Scanner tec1 = new Scanner(System.in);
        int pos1,pos2;
        imprimir(nomeUsuario2+", digite a linha e a coluna que deseja colocar sua marcação: ");
        imprimir("Linha:");
        pos1 = tec1.nextInt();
        imprimir("Coluna:");
        pos2 = tec1.nextInt();

        jogo[pos1-1][pos2-1] = 'o';

        return jogo;
    }

    public static boolean posicoes(int pos){

        return false;
    }
    
    public static boolean Vencedor2(char[][]seq) {
    	boolean eVencedor=false;
    	if ((seq[0][0]=='o'&& seq[1][0]=='o' && seq[2][0]=='o')||//coluna
    	(seq[0][1]=='o' && seq[1][1]=='o' && seq[2][1]=='o')||//coluna
    	(seq[0][2]=='o' && seq[1][2]=='o' && seq[2][2]=='o')||//coluna
    	(seq[0][0]=='o' && seq[0][1]=='o' && seq[0][2]=='o')||//linha
    	(seq[1][0]=='o' && seq[1][1]=='o' && seq[1][2]=='o')||//linha
    	(seq[2][0]=='o' && seq[2][1]=='o' && seq[2][2]=='o')||//linha
    	(seq[0][0]=='o' && seq[1][1]=='o' && seq[2][2]=='o')||//diagonal
    	(seq[2][0]=='o' && seq[1][1]=='o' && seq[0][2]=='o'))//diagonal
    	{
    		System.out.print(nomeUsuario2+" venceu\n");
    		eVencedor=true;
    	}
    	return eVencedor;
    }
    
    public static boolean Vencedor1(char[][]seq) {
    	boolean eVencedor=false;
    	if ((seq[0][0]=='x'&& seq[1][0]=='x' && seq[2][0]=='x')||//coluna
    	(seq[0][1]=='x' && seq[1][1]=='x' && seq[2][1]=='x')||//coluna
    	(seq[0][2]=='x' && seq[1][2]=='x' && seq[2][2]=='x')||//coluna
    	(seq[0][0]=='x' && seq[0][1]=='x' && seq[0][2]=='x')||//linha
    	(seq[1][0]=='x' && seq[1][1]=='x' && seq[1][2]=='x')||//linha
    	(seq[2][0]=='x' && seq[2][1]=='x' && seq[2][2]=='x')||//linha
    	(seq[0][0]=='x' && seq[1][1]=='x' && seq[2][2]=='x')||//diagonal
    	(seq[2][0]=='x' && seq[1][1]=='x' && seq[0][2]=='x'))//diagonal
    	{
    		System.out.print(nomeUsuario1+" venceu\n");
    		eVencedor=true;
    	}
    	return eVencedor;
    }

    // JOGO DA FORCA


    public static void jogoDaForca() {
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
}