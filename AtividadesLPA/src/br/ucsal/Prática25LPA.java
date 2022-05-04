package br.ucsal;

public class Prática25LPA {

	/*Problema: elabore uma sequencia dinamicamente de anos bissextos no intervalo fechado de 1900 a 2032.*/
	
	public static void main(String[] args) {
		for(int anoBissexto =1900; anoBissexto<=2032;anoBissexto+=4) {
			if(anoBissexto%4==0 && anoBissexto%100!=0 || anoBissexto%4==0 
					&& anoBissexto%100==0 && anoBissexto%400==0) {
				System.out.print(anoBissexto+" ");
			}
			
		}

	}

}
