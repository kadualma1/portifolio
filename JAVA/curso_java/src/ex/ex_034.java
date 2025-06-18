package ex;

import java.util.Scanner;

public class ex_034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores cada vetor terá? ");
		int n = sc.nextInt();
		double[] A = new double[n];
		double[] B = new double[n];
		double[] C = new double[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextDouble();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextDouble();
		}
		
		System.out.println("Vetor resultante: ");
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
		
		sc.close();

	}

}
