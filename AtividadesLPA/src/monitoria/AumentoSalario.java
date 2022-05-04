package monitoria;

import java.util.Scanner;

public class AumentoSalario {
	
	/*01 - Crie uma classe de nome AumentoSalario e no seu método main 
	elabore um algoritmo em JAVA para ler 1 valor que será referente ao 
	Salário, deverá ser calculado o aumentoSalarial de 4% desse valor 
	a cada 4 meses no período de 1 ano.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	int quadrimestre=0;
	double salario;
	System.out.println("Informe o salário");
	salario = sc.nextDouble();
	while (quadrimestre <= 3) {
		System.out.println(salario);
		quadrimestre++;
		salario*=1.04;
	}
	sc.close();
	}

}
