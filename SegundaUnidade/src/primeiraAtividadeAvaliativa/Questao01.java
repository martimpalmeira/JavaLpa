package primeiraAtividadeAvaliativa;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		double nota1P=obterValor();
		double nota2P=obterValor();
		double nota3P=obterValor();
		double media1=mediaUnidade1(nota1P,nota2P,nota3P);	
		double nota1S=obterValor();	
		double nota2S=obterValor();
		double nota3S=obterValor();	
		double media2=mediaUnidade2(nota1S,nota2S,nota3S);
		double mediaF = mediaFinal(media1,media2);
		resultadoFinal(mediaF);
		imprimir(resultadoFinal(mediaF)+ " e sua média final é "+ mediaF);
		
		
		

	}
	
	public static double obterValor(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double nota;
		imprimir("Informe uma nota válida: ");
		nota=sc.nextDouble();
		while (nota<0 || nota>10) {
			imprimir("Informe uma nota válida: ");
			nota=sc.nextDouble();
		}
		return nota;
	}
	
	public static double mediaUnidade1(double v1,double v2, double v3) {
		double media1;
		media1 = (v1*2 + v2*3 + v3*5)/(2+3+5);
		return media1;
	}
	
	public static double mediaUnidade2(double v1,double v2, double v3) {
		double media1;
		media1 = (v1*3 + v2*3 + v3*4)/(3+3+4);
		return media1;
	}
	
	public static double mediaFinal(double v1,double v2) {
		double mediaF;
		mediaF = (v1 + v2)/2;
		return mediaF;
	}
	public static String resultadoFinal(double v1) {
		if (v1 >= 6){
			return ("Aprovado");
		}else {
			return ("Reprovado");
		}
	}
	public static void imprimir(String str) {
		System.out.println(str);
	}
	
	public static void imprimir(double str) {
		System.out.println(str);
	}
	
}
