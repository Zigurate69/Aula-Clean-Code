package LPAlore;

import java.util.Scanner;

public class Lpalesson48 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int fat = 1, num;

		System.out.println("Informe o Fatorial: ");
		num = ler.nextInt();

		if (num <= 0) {
			System.out.println("Não existe fatorial de número negativo!");
		}
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				fat *= i;
			}
			System.out.println("O fatorial de "+ num + " é : " + fat);
		}
		ler.close();
	}
}