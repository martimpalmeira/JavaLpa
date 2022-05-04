package br.ucsal;

import java.util.Scanner;

public class Prática12LPA {

/* Problema: Elabore uma solução em JAVA para ler o nome, 
 * a altura, o peso, o endereço completo (separados por partes: rua, 
 * numero, bairro, cep, cidade, estado) e a situação do usuário no cadastro 
 * (ativo / inativo) informados pelo usuário. A solução deve retornar para o 
 * usuário uma impressão de saída contendo o nome e o endereço completo informado. 
 * Para essa solução, cada elemento informado deve ser inserido 
 * em uma variável específica, o título inicial apresentado deve ser CADASTRO. . */
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String nome, rua, bairro, cidade, estado;
	float altura = 0, peso = 0;
	int numero, cep, cadastro;
	System.out.println("Informe o seu nome:");
	nome = sc.nextLine();
	System.out.println("Informe a sua altura:");
	altura = sc.nextFloat();
	sc.nextLine();
	System.out.println("Informe o seu peso:");
	peso = sc.nextFloat();
	sc.nextLine();
	System.out.println("Informe a rua do seu endereço:");
	rua = sc.nextLine();
	
	System.out.println("Informe o número do seu endereço:");
	numero = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Informe o bairro do seu endereço:");
	bairro = sc.nextLine();
	System.out.println("Informe o cep do seu endereço:");
	cep = sc.nextInt();
	sc.nextLine();
	System.out.println("Informe a cidade do seu endereço:");
	cidade = sc.nextLine();
	
	System.out.println("Informe o estado da sua cidade:");
	estado = sc.nextLine();
	System.out.println("Informe sua situação no cadastro:\n1) Ativo\n2) Inativo\n");
	cadastro = sc.nextInt();
	sc.nextLine();
		if (cadastro == 1) {
			System.out.println("Seu nome é "+nome+" sua altura é "+altura+"m seu peso é "+peso+"kg e o seu endereço completo é "+ 
		rua+", "+numero+", "+bairro+", "+cep+", "+cidade+", "+estado+" e a situação do seu cadastro está Ativo");
		}
		else if (cadastro == 2) {
			System.out.println("Seu nome é "+nome+" sua altura é "+altura+"m seu peso é "+peso+"kg e o seu endereço completo é "+ 
		rua+", "+numero+", "+bairro+", "+cep+", "+cidade+", "+estado+" e a situação do seu cadastro está Inativo");
		}
	sc.close();
}
		
}
