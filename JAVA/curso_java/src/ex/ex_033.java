package ex;

import java.util.Scanner;

public class ex_033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		int posMaior = 0;
		double maior = 0.0;
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f%nPOSIÇÃO DO MAIOR VALOR = %d", maior, posMaior);
		
		sc.close();

	}

}
