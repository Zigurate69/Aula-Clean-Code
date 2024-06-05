package LPAlore;

import java.util.Scanner;

public class Lpalesson52 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = (int)Math.round(Math.random()*10);
				b[i][j] = (int)Math.round(Math.random()*10);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("O valor da MATRIZ C na posição " + "(" + i + j + ")" + "é : " + c[i][j]);
			}
			ler.close();
		}
	}
}