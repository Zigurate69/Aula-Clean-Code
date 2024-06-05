package LPAlore;

import java.util.Scanner;

public class Lpalesson49 {

	public static void main(String[] args) {


		double a;

		Scanner ler = new Scanner (System.in);


		System.out.println("Informe um valor: ");
		a = ler.nextDouble();

		if (a % 5 == 0) {
			System.out.println("O número " + a + " é multiplo de 5");
		}
		if (a % 5 != 0) {
			System.out.println("O número " + a + " não é multiplo de 5");
			ler.close();
		}
	}
}