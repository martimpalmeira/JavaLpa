package br.ucsal;

public class Prática37LPA {
	
	/* Problema: elabore uma solução para que um método 
	 * retorne um array bidimensional com tamanho 5x8 que 
	 * deverá ser preenchido com valores inteiros formando 
	 * uma sequencia Fibonacci iniciada com 0 e 1. O array 
	 * retornado deverá ser passado como parâmetro para um 
	 * outro método que vai retornar um novo array do tipo 
	 * String contendo os mesmos valores do array recebido 
	 * no parâmetro, porém preenchidos com zeros a esquerda 
	 * de forma que todos os elementos tenham uma quantidade 
	 * padronizada de 9 unidades. Ex: 000000000, 000000001, 000000001 ... 102334155*/

	public static void main(String[] args) {
		Imprimir(ArrayFibo());
		Imprimir(ArrayStr(ArrayFibo()));
	}
	
	
	public static int [][] ArrayFibo(){
		int [][]vetor = new int[5][8];
		for(int i=0,x=0,y=1,z=0;i<vetor.length;i++) {	
			for(int j=0; j<vetor[i].length;j++) {
				vetor[i][j] = x;
				z=x+y;
				x=y;
				y=z;				
			}
		}return vetor;
	}
	
	
	public static String [][][] ArrayStr(int[][]vetor){
		String[][][] vetorCom0 = new String [5][8][9];		
		for (int i=0; i<5;i++) {
			for (int j=0; j<8; j++) {
				String vetorStr = Integer.toString(vetor[i][j]);			
				int numDeZeros=9-vetorStr.length();		
				for (int k=0,c=0; k<9;k++) {
					if (k<numDeZeros) {
						vetorCom0[i][j][k]="0";
					}
					else {				
						char caracterVetor = vetorStr.charAt(c);
						String caracterVetorStr = String.valueOf(caracterVetor);
						vetorCom0[i][j][k]= caracterVetorStr;
						c++;
					}
				}
			}			
		}return vetorCom0;
	}
		
	
	public static void Imprimir(int [][]vetor) {
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j<vetor[i].length;j++) {
				System.out.print(vetor[i][j]+" ");
			}System.out.println();
		}
	}
	

	public static void Imprimir(String [][][]vetor) {
		for(int i=0;i<vetor.length;i++) {
			for(int j=0;j<vetor[i].length;j++) {			
				for(int k=0;k<vetor[i][j].length;k++) {
					System.out.print(vetor[i][j][k]);
				}System.out.print(" ");
			}System.out.println();
		}
	}

	
}
