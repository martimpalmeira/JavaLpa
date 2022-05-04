package br.ucsal;

import java.util.Scanner;

public class Prática35LPA {
	
	/*Problema: elabore uma solução para calcular a quantidade 
	 * de dias de vida do usuário. Para isso use um método para 
	 * informar a quantidade de dias de vida do primeiro ano, 
	 * outro para a quantidade de dias de vida dos anos intermediários, 
	 * um para identificar os dias do mês e um para retornar a quantidade 
	 * de dias de vida do ano atual.
	 * OBS: Considere os anos bissextos no período.*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o ano de nascimento: ");
		int anoNasc = sc.nextInt();
		int nDiasPrimeiroAno=diasPrimeiroAno(diasDoMes(anoNasc));
		System.out.print("Informe o ano atual: ");
		int anoAtual = sc.nextInt();
		int nDiasAnoAtual=diasAnoAtual(diasDoMes(anoAtual));		
		int nDiasAnosInterm = diasAnosInterm(anoNasc,anoAtual);
		int nDiasVividos = nDiasPrimeiroAno + nDiasAnosInterm + nDiasAnoAtual;
		System.out.print(nDiasVividos+" dias vividos");
	}
	
	public static int diasPrimeiroAno(int[] diasDosMeses) {
		int somaDiasPosteriores=0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o mês de nascimento: ");
		int m = sc.nextInt();
		System.out.print("Informe o dia de nascimento: ");
		int d = sc.nextInt();	
		for(int i=m;i<diasDosMeses.length;i++) {
			somaDiasPosteriores+=diasDosMeses[i];			
		}
		int diasRestantes = diasDosMeses[m-1]-d;
		int diasVividosAnoNasci = somaDiasPosteriores + diasRestantes;
		return diasVividosAnoNasci;
				
	}
	
	
	public static int diasAnosInterm (int anoNasc, int anoAtual) {
		int[] anosDoMeio = new int[anoAtual-anoNasc-1];
		for(int i=0,c=1;i<anosDoMeio.length;i++,c++) {
			anosDoMeio[i]=anoNasc+c;
		}
		int somaDiasAnosInterm=0;
		for(int i=0;i<anosDoMeio.length;i++) {
			if((anosDoMeio[i]%4==0 && anosDoMeio[i]%100!=0) || anosDoMeio[i]%400==0) {
				anosDoMeio[i]=366;
			}else {
				anosDoMeio[i]=365;
			}
			somaDiasAnosInterm += anosDoMeio[i];
		}
		return somaDiasAnosInterm;
	}
	
	public static int[] diasDoMes(int ano) {
		int[] diasDoMes = new int[12];
		diasDoMes[0] = 31;
		if ((ano%4==0 && ano%100!=0) || ano%400==0) {
			diasDoMes[1]=29;
		}else {
			diasDoMes[1]=28;
		}
		diasDoMes[2] = 31;
		diasDoMes[3] = 30;
		diasDoMes[4] = 31;
		diasDoMes[5] = 30;
		diasDoMes[6] = 31;
		diasDoMes[7] = 31;
		diasDoMes[8] = 30;
		diasDoMes[9] = 31;
		diasDoMes[10] = 30;
		diasDoMes[11] = 31;
		return diasDoMes;
	}
	
	public static int diasAnoAtual(int[] diasDosMeses) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o mês atual: ");
		int m = sc.nextInt();
		System.out.print("Informe o dia atual: ");
		int d = sc.nextInt();
		int somaDiasMesesAnteriores=0;
		for(int i=0;i<m-1;i++) {
			somaDiasMesesAnteriores+=diasDosMeses[i];
		}
		int diasTotaisAnoAtual = somaDiasMesesAnteriores+d;
		return diasTotaisAnoAtual;
	}

}
