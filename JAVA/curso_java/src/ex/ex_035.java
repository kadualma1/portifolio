package ex;

import java.util.Scanner;

public class ex_035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos o vetor terá? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0;
				
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		
		System.out.println();		
		media /= vect.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println();	
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
