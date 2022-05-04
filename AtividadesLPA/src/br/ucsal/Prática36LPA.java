package br.ucsal;

public class Prática36LPA {
	
	/* Problema: elabore uma solução para preencher 
	 * dinamicamente um array bidimensional de tamanho 
	 * 3 x 5 com uma sequencia crescente de 15 valores inteiros, 
	 * pares iniciados por 8. O array deve ser retornado em um 
	 * método específico, cujos parâmetros serão os valores que 
	 * irão definir o seu tamanho.*/

	public static void main(String[] args) {
		Imprimir(arrayBi(3,5));

	}
	
	public static int [][] arrayBi (int tam1, int tam2){
		int [][] arrayBi = new int[tam1][tam2];
		for (int i=0,c=8; i<tam1 ;i++) {
			for (int j=0; j<tam2; j++,c+=2) {
				arrayBi[i][j]=c;
				
			}
			 
		}
		return arrayBi;
	}
	
	public static void Imprimir(int [][]Array) {
		for (int i=0; i<Array.length ;i++) {
			for (int j=0; j<Array[i].length; j++) {
				System.out.print(Array[i][j]+" ");
			}System.out.println();
		}
			
	}

}
