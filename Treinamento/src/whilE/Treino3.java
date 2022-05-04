package whilE;

import java.util.Scanner;

public class Treino3 {
	
	/*3. Programa em Java que mostra os números pares e ímpares 
	Escreva um aplicativo em Java que recebe inteiro e mostra os 
	números pares e ímpares (separados), de 1 até esse inteiro.*/


	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int numerosPares=0, numerosImpares=1, numeroUsuario;
	System.out.print("Usuário informe o número limite das sequências: ");
	numeroUsuario = sc.nextInt();
	while (numerosPares<=numeroUsuario) {
		System.out.print(numerosPares+",");
		numerosPares += 2;
	}
	System.out.print("\n");
	while (numerosImpares<=numeroUsuario) {
		System.out.print(numerosImpares+",");
		numerosImpares +=2;
	}
	sc.close();
	}

}
