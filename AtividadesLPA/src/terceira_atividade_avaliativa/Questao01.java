package terceira_atividade_avaliativa;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mes, ano;
		System.out.println("Informe um ano: ");
		ano = input.nextInt();
		System.out.println("Informe o mês do ano: ");
		mes = input.nextInt();
		if (ano>=1900 && ano<=2020) {
			if (mes>=1 && mes<=12) {
			if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {										
				switch (mes) {
				case(1):
					System.out.println("A quantidade de dias é 31");
					break;
				case(2):
					System.out.println("A quantidade de dias é 29");
					break;
				case(3):
					System.out.println("A quantidade de dias é 31");
					break;
				case(4):
					System.out.println("A quantidade de dias é 30");
					break;
				case(5):
					System.out.println("A quantidade de dias é 31");
					break;
				case(6):
					System.out.println("A quantidade de dias é 30");
					break;
				case(7):
					System.out.println("A quantidade de dias é 31");
					break;
				case(8):
					System.out.println("A quantidade de dias é 31");
					break;
				case(9):
					System.out.println("A quantidade de dias é 30");
					break;
				case(10):
					System.out.println("A quantidade de dias é 31");
					break;
				case(11):
					System.out.println("A quantidade de dias é 30");
					break;
				case(12):
					System.out.println("A quantidade de dias é 31");
					break;
				}
				
				}else {
					switch (mes) {
					case(1):
						System.out.println("A quantidade de dias é 31");
						break;
					case(2):
						System.out.println("A quantidade de dias é 28");
						break;
					case(3):
						System.out.println("A quantidade de dias é 31");
						break;
					case(4):
						System.out.println("A quantidade de dias é 30");
						break;
					case(5):
						System.out.println("A quantidade de dias é 31");
						break;
					case(6):
						System.out.println("A quantidade de dias é 30");
						break;
					case(7):
						System.out.println("A quantidade de dias é 31");
						break;
					case(8):
						System.out.println("A quantidade de dias é 31");
						break;
					case(9):
						System.out.println("A quantidade de dias é 30");
						break;
					case(10):
						System.out.println("A quantidade de dias é 31");
						break;
					case(11):
						System.out.println("A quantidade de dias é 30");
						break;
					case(12):
						System.out.println("A quantidade de dias é 31");
						break;
					}
				}
			}
			else {
				System.out.println("o mês informado não é válido");
			}
			
		}
		else {
			System.out.println("o critério para definição do ano não foi atendido");
		}
	
		
		input.close();
	}

}
