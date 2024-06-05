package LPAlore;

import java.util.Scanner;

public class Lpalesson51 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor do Vetor A..: ");
			a[i] = ler.nextInt();
			
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Informe o " + i + "° valor do Vetor B");
			b[i] = ler.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			c[i] = a[i];
			c[i+2] = b[i];
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("Conjunto do " + i + "° valor Vetor A e B..: " + c[i]);
		}
		ler.close();
	}
}