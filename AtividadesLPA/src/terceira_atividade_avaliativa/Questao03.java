package terceira_atividade_avaliativa;

public class Questao03 {

	public static void main(String[] args) {
		int primeiroValor = 0, segundoValor = 1,terceiroValor, contador = 1;
		System.out.print(primeiroValor+" "+segundoValor+" ");
		for (;contador<=28; contador++) {
			terceiroValor = primeiroValor + segundoValor;
			primeiroValor = segundoValor;
			segundoValor = terceiroValor;
			System.out.print(terceiroValor+" ");
		}

	}

}
