package whilE;

public class Questao06 {

	public static void main(String[] args) {
		int val = 19;
		int razao = 4;
		int soma = 0;
		while (val <= 498){
			soma = val;
			val = val + razao;
			soma = soma + val;
		}
		 System.out.println(soma);

	}

}
