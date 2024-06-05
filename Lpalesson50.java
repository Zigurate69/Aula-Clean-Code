package LPAlore;

import java.util.Scanner;

public class Lpalesson50 {

	public static void main(String[] args) {

		int senhaMestre, senhaTentativa;
		double n1, n2, soma;

		Scanner ler = new Scanner (System.in);
		
		System.out.println("Cadastre uma senha (Apenas Números) : ");
		senhaMestre = ler.nextInt();
		
		System.out.println("Digite um número: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite outro número: ");
		n2 = ler.nextDouble();
		
		soma = n1 + n2;
		
		System.out.println("Digite a sua senha para desbloquear o resultado da soma: ");
		senhaTentativa = ler.nextInt();
		
		if (senhaTentativa == senhaMestre) {
			System.out.println("O resultado da soma é: " + soma);
		}
		if (senhaTentativa != senhaMestre) {
			System.out.println("Erro! Senha errada!");
			ler.close();
		}
	}
}