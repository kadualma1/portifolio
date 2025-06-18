package ex;

import java.util.Scanner;

public class ex_030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			soma += vect[i];
		}
		
		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + soma / vect.length);
		
		sc.close();

	}

}
