package segunda_atividade_avaliativa;

import java.util.Scanner;

public class Questao002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double eletro1, eletro2 , rs; 
		System.out.println("Usuário informe o valor da primeira compra: ");
		eletro1 = sc.nextDouble();
		System.out.println("Usuário informe o valor da segunda compra: ");
		eletro2 = sc.nextDouble();
		rs = eletro1 + eletro2;
		if
			(rs >= 200 && rs<1000) {
			rs=rs*0.8;
		
			System.out.println ("O resultado com desconto é "+ rs);
			}
		
		else if
			(rs>=1000) {rs=rs*0.75;
		System.out.println ("O resultado com desconto é " + rs);
		}
		
		else
			 {System.out.println ("O resultado é "+rs);
			 }
		sc.close();
	}
}
