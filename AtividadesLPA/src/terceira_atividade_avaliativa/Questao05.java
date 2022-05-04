package terceira_atividade_avaliativa;

public class Questao05 {

	public static void main(String[] args) {
		int valorDaSequencia=200;
		for (;valorDaSequencia>=100;valorDaSequencia-=1) {
			if (valorDaSequencia%2==0) {
				if(valorDaSequencia%3==0) {
					System.out.print(valorDaSequencia+" ");
				}
			}
		}

	}

}
