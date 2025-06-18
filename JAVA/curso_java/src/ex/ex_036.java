package ex;

import java.util.Scanner;

public class ex_036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		int qtdPares = 0;
		double media = 0;
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				media += vect[i];
				qtdPares++;
			}
		}

		if (qtdPares != 0) {
			media /= qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} else {
			System.out.print("NENHUM PAR");
		}

		sc.close();

	}

}
