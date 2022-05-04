package monitoria;

import java.util.Scanner;

public class MaiorValor {
	
	public static void main(String[] args) {
		 
		/* 02 - Crie uma classe de nome MaiorValor e 
		 * no seu método main elabore um algoritmo
		 *  em JAVA para ler 03 valores inteiros 
		 *  aleatórios não repetidos informados pelo 
		 *  usuário em um intervalo fechado de 10 a 
		 *  90, seja apresentado o maior valor dos três 
		 *  informados. Para isso, considere que: (1) caso 
		 *  algum valor informado esteja fora do intervalo 
		 *  ou repetido o resultado apresentado deve ser 
		 *  "valores incorretos".*/
		
		Scanner sc = new Scanner(System.in);
		int valor1,valor2,valor3;
		System.out.println("Informe três valores inteiros, diferentes num intervalo fechado de 10 a 90");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		valor3 = sc.nextInt();
		if (valor1<10 || (valor1>90 || valor2<10 || valor2>90 || valor3<10 || valor3>90 || valor1==valor2 || valor1==valor3 || valor2==valor3)){
			System.out.println("Valores Incorretos");
		}
		else { 
			if ((valor1>valor2) && (valor1>valor3) && (valor2>valor3)){
				System.out.println("O maior valor é "+ valor1 +" e o menor valor é "+ valor3);
			}
			else if ((valor1>valor2) && (valor1>valor3) && (valor3>valor2)){
				System.out.println("O maior valor é "+ valor1 +" e o menor valor é "+ valor2);
			}
			else if ((valor2>valor1) && (valor2>valor3) && (valor1>valor3)){
				System.out.println("O maior valor é "+ valor2 +" e o menor valor é "+ valor3);
			}
			else if ((valor2>valor2) && (valor2>valor3) && (valor3>valor1)){
				System.out.println("O maior valor é "+ valor2 +" e o menor valor é "+ valor1);
			}
			else if ((valor3>valor1) && (valor3>valor2) && (valor1>valor2)){
				System.out.println("O maior valor é "+ valor3 +" e o menor valor é "+ valor2);
			}
			else {
				System.out.println("O maior valor é "+ valor3 +" e o menor valor é "+ valor1);
			}
		}
		sc.close();
	}


}
