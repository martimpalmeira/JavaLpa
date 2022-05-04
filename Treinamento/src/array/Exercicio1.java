package array;

public class Exercicio1 {

	public static void main(String[] args) {
	imprimir(lista());
	}
	
	public static int[] lista() {
		int[] numeros = new int[5];
		for(int i=0,x=1;i<numeros.length;i++,x+=2) {
			numeros[i]=x;
		}
		return numeros;
	}
	
	public static void imprimir(int[] x) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		
	}
}
